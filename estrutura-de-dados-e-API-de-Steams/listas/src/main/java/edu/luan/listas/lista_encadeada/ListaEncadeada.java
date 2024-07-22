package edu.luan.listas.lista_encadeada;

public class ListaEncadeada<T> {
    private No<T> referenciaEntada;

    public ListaEncadeada(){
        this.referenciaEntada = null;
    }
    public boolean isEmpty(){
        return referenciaEntada == null ? true : false;
    }
}
