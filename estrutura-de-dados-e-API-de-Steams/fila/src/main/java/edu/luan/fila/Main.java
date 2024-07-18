package edu.luan.fila;

public class Main {
    public static void main(String[] args) {
        fila<String> minhaFila = new fila<String>();
        minhaFila.enqueue("lasanha");
        minhaFila.enqueue("1");
        minhaFila.enqueue("true");
        
        
        System.out.println(minhaFila);
        minhaFila.dequeue();
        System.out.println(minhaFila);
        System.out.println(minhaFila.first());

    }
}