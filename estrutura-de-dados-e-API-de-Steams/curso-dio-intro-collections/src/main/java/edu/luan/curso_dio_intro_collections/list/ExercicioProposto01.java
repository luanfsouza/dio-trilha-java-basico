package edu.luan.curso_dio_intro_collections.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioProposto01 {
    public static void main(String[] args) {

        List<ArcoIris> arcoIris = new LinkedList<>() {
            {
                add(new ArcoIris("Laranja"));
                add(new ArcoIris("Amarelo"));
                add(new ArcoIris("Verde"));
                add(new ArcoIris("Azul Claro"));
                add(new ArcoIris("Azul Escuro"));
                add(new ArcoIris("Violeta"));
            }
        };

        System.out.println("---- Cores Arco-Iris ----");
        for (ArcoIris corArcoIris : arcoIris)
            System.out.println(corArcoIris);

        System.out.println("---- Quantidade de Cores ----");
        System.out.println(arcoIris.size());

        System.out.println("---- Ordem Alfabetica ----");
        Set<ArcoIris> arcoIrisAlfabetico = new TreeSet<>(arcoIris);
        System.out.println(arcoIrisAlfabetico);

        System.out.println("---- Ordem Inversa ----");
        List<ArcoIris> arcoIrisInvertido = new LinkedList<>(arcoIrisAlfabetico);
        Collections.reverse(arcoIrisInvertido);
        System.out.println(arcoIrisInvertido);

        System.out.println("---- Cores com a letra V ----");
        Iterator<ArcoIris> iterator = arcoIrisInvertido.iterator();
        while (iterator.hasNext()) {
            ArcoIris next = iterator.next();
            //System.out.println("olha aqui "+next.charAt(0));
            if(next.getCor().charAt(0) != 'V') iterator.remove();
        }
        System.out.println(arcoIrisInvertido);

        System.out.println("---- Limpando o conjunto... ----");
        arcoIrisInvertido.removeAll(arcoIrisInvertido);

        System.out.println("---- Conferindo se o conjunto esta limpo ----");
        System.out.println(arcoIrisInvertido);

    }

}

class ArcoIris implements Comparable<ArcoIris> {
    private String cor;

    @Override
    public int compareTo(ArcoIris o) {
        return this.getCor().compareTo(o.getCor());
    }

    public ArcoIris(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return cor;
    }

}