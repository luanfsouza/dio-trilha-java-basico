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
}
