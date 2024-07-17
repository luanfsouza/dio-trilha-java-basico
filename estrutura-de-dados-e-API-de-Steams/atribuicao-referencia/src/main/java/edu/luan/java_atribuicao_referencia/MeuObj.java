package edu.luan.java_atribuicao_referencia;



public class MeuObj {
    Integer num;
    public void setNum(int numero){
        this.num = numero;
    }
    public MeuObj(int numero){
        this.num = numero;
    }
    @Override
    public String toString() {
        return this.num.toString();
    }
    
}
