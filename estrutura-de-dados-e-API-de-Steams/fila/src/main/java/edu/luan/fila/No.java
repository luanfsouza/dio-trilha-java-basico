package edu.luan.fila;

public class No<T> {
    private T object;
    private No<T> refNo;

    public No(T object) {
        this.refNo = null;
        this.object = object;
    }
    public No() {
    }
    public T getObject() {
        return this.object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public No<T> getRefNo() {
        return this.refNo;
    }

    public void setRefNo(No<T> refNo) {
        this.refNo = refNo;
    }
    @Override
    public String toString() {
        return "No [object=" + object + "]";
    }
    

}
