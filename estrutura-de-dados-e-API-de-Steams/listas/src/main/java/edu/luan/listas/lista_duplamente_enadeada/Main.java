package edu.luan.listas.lista_duplamente_enadeada;

public class Main {
    public static void main(String[] args){
        ListaDuplamenteEncadeada<String> minhaListaEncadeada = new ListaDuplamenteEncadeada<>();

        minhaListaEncadeada.add("C1");
        minhaListaEncadeada.add("C2");
        minhaListaEncadeada.add("C3");
        minhaListaEncadeada.add("C4");
        minhaListaEncadeada.add("C5");
        minhaListaEncadeada.add("C6");
        minhaListaEncadeada.add("C7");
        System.out.println(minhaListaEncadeada);
        
        System.out.println(minhaListaEncadeada.get(2));

        minhaListaEncadeada.add(2, "novo C");
        System.out.println(minhaListaEncadeada.get(2));

        System.out.println(minhaListaEncadeada);

        minhaListaEncadeada.remove(3);
        System.out.println(minhaListaEncadeada);
    }
}
