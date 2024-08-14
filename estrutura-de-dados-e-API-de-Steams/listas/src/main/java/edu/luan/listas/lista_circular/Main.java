package edu.luan.listas.lista_circular;

public class Main {
    public static void main(String[] args){
        ListaCircular<String> minhaListaCircular = new ListaCircular<>();

        minhaListaCircular.add("F1");
        minhaListaCircular.add("F2");
        minhaListaCircular.add("F3");

        for(int i = 0; i < 20; i++){
            System.out.println(minhaListaCircular.get(i));
        }
}
}