package edu.luan.arvores;

public class ArvoreBinaria<T extends Comparable<T>> {
    private NoBin<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(T conteudo) {
        NoBin<T> novoNo = new NoBin<T>(conteudo);
        raiz = inserir(raiz, novoNo);
    }

    private NoBin<T> inserir(NoBin<T> atual, NoBin<T> novoNo) {
        if (atual == null) {
            return novoNo;
        } else if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) {
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        } else {

            atual.setNoDir(inserir(atual.getNoDir(), novoNo));
        }
        return atual;
    }

    public void exibirInOrdem(){
        System.out.println("\n Exibindo InOrdem");
        exibirInOrdem(this.raiz);
    }
    private void exibirInOrdem(NoBin<T> atual){
        if(atual != null){
            exibirInOrdem(atual.getNoEsq());
            System.out.println(atual.getConteudo()+", ");
            exibirInOrdem(atual.getNoDir());
        }
    }

    public void exibirPosOrdem() {
        System.out.println("\n Exibindo InOrdem");
        exibirPosOrdem(this.raiz);
    }

    private void exibirPosOrdem(NoBin<T> atual) {
        if (atual != null) {
            exibirPosOrdem(atual.getNoEsq());
            exibirPosOrdem(atual.getNoDir());
            System.out.println(atual.getConteudo() + ", ");
        }
    }
}
