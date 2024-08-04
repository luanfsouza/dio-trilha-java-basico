package edu.luan.arvores;

public class NoBin<T> {
    private T conteudo;
    private NoBin<T> noEsq;
    private NoBin<T> noDir;

    public NoBin(T conteudo){
        this.conteudo = conteudo;
        this.noEsq = null;
        this.noEsq = null;
    }


    public T getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoBin<T> getNoEsq() {
        return this.noEsq;
    }

    public void setNoEsq(NoBin<T> noEsq) {
        this.noEsq = noEsq;
    }

    public NoBin<T> getNoDir() {
        return this.noDir;
    }

    public void setNoDir(NoBin<T> noDir) {
        this.noDir = noDir;
    }


}
