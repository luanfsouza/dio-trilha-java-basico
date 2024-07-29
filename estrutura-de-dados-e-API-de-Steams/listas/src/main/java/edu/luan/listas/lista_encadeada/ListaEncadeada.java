package edu.luan.listas.lista_encadeada;

public class ListaEncadeada<T> {
    private No<T> referenciaEntrada;

    public ListaEncadeada() {
        this.referenciaEntrada = null;
    }

    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);

        if (isEmpty()) {
            referenciaEntrada = novoNo;
            return;
        }
        No<T> refAuxiliar = referenciaEntrada;
        for (int i = 0; i < this.size() - 1; i++) {
            if (refAuxiliar.getProximoNo() != null) {
                refAuxiliar = refAuxiliar.getProximoNo();
            }
        }

        refAuxiliar.setProximoNo(novoNo);

    }

    public No<T> get(int index) {
        No<T> refAuxiliar = referenciaEntrada;

        if (!isEmpty()) {
            if (size() - 1 >= index) {
                for (int i = 0; i < index; i++) {
                    refAuxiliar = refAuxiliar.getProximoNo();
                }
            } else {
                validaIndice(index);
            }

        }
        return refAuxiliar;
    }

    public No<T> getNo(int index) {
        validaIndice(index);
        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;
        for (int i = 0; i < this.size(); i++) {
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    public T remove(int index) {
        No<T> noAlvo = this.get(index);
        if (index == 0) {
            referenciaEntrada = noAlvo.getProximoNo();
            return noAlvo.getConteudo();
        }
        No<T> noAnterior = get(index - 1);
        noAnterior.setProximoNo(noAlvo.getProximoNo());
        return noAlvo.getConteudo();
    }

    private void validaIndice(int index) {
        if (index >= size()) {
            throw new IndexOutOfBoundsException("Não existe conteúdo no indice " + index
                    + " desta lista. Esta lista só vai até o indice " + (this.size() - 1));
        }

    }

    public int size() {
        int tamanhoDaLista = 0;
        No<T> refAuxiliar = referenciaEntrada;

        while (true) {

            if (!isEmpty()) {
                tamanhoDaLista++;
                if (refAuxiliar.getProximoNo() != null) {
                    refAuxiliar = refAuxiliar.getProximoNo();
                } else {
                    break;
                }
            } else {
                break;
            }

        }
        return tamanhoDaLista;
    }

    public boolean isEmpty() {
        return referenciaEntrada == null ? true : false;
    }

    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = referenciaEntrada;
        for (int i = 0; i < this.size(); i++) {
            strRetorno += "No[conteudo=" + noAuxiliar.getConteudo() + "] ====>>> ";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
