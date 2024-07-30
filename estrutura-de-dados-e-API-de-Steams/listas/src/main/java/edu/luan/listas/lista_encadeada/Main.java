package edu.luan.listas.lista_encadeada;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada<String> minhaLista = new ListaEncadeada<>();

        System.out.println(minhaLista.size());

        minhaLista.add("primeiro");
        minhaLista.add("segundo");
        minhaLista.add("terceiro");
        minhaLista.add("quarto");
        minhaLista.add("quinto");

        System.out.println(minhaLista.size());

        System.out.println(minhaLista.get(2));
        System.out.println(minhaLista.getNo(2));

        System.out.println(minhaLista.remove(2));

        System.out.println(minhaLista.get(1)); 
        
        System.out.println(minhaLista); 
    }
}