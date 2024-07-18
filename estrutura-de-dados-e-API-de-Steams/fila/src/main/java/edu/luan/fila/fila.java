package edu.luan.fila;

public class fila<T> {
    private No<T> ultimaRefNo;

    public fila(){
        this.ultimaRefNo = null;
    }
    public void enqueue(T object){
        No<T> novoObject = new No<T>(object);
        novoObject.setRefNo(ultimaRefNo);
        ultimaRefNo = novoObject;
    }
    public T dequeue(){
        No primeiroNo = ultimaRefNo;
        No noAuxiliar = ultimaRefNo;
        if(!isEmpty()){
            while (true) {
                if(primeiroNo.getRefNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                } else{
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }
    public boolean isEmpty(){
        return ultimaRefNo == null ? true : false;
    }
    public T first(){
        if(!isEmpty()){
            No primeiroNo = ultimaRefNo;
            while (true) {
                if(primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();
                } else{
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }
    public String toString(){
        String minhaString =  "";
        No<T> noAuxiliar = ultimaRefNo;
        if(!isEmpty()){
            while (true) {
                minhaString += "[conteudo="+noAuxiliar.getObject()+"]\n";
                if(noAuxiliar.getRefNo() != null){
                    
                    noAuxiliar = noAuxiliar.getRefNo();
                } else{ return minhaString;}
            }
        } else{
            return minhaString += "null";
        }
        
    }
}
