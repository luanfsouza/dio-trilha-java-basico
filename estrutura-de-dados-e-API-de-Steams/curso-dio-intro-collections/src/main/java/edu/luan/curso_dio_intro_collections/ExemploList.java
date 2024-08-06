package edu.luan.curso_dio_intro_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        List<Double> notas1 = new ArrayList<>();
        List<Double> notas2 = new ArrayList<>(Arrays.asList(1.2, 3.0, 10.0, 25.5));
        List<Double> notas3 = Arrays.asList(1.2, 3.0, 10.0, 25.5);

        notas1.add(2.5);
        notas1.add(10.0);
        notas1.add(1.6);
        notas1.add(9.9);
        notas1.add(54.1);

        System.out.println(notas1.indexOf(4.6));

        notas1.add(3, 33.9);
        System.out.println(notas1);

        notas1.set(notas1.indexOf(9.9), 999.99);
        System.out.println(notas1);

        System.out.println(notas1.contains(4.6));

        for (Double nota : notas1)
            System.out.println(nota);

        System.out.println(Collections.min(notas1));
        System.out.println(Collections.max(notas1));

        Iterator<Double> iterator = notas1.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        Double soma2 = 0.0;
        for (int x = 0; x < notas1.size(); x++) {
            soma2 += notas1.get(x);
        }
        System.out.println(soma2);

        notas1.remove(33.9);
        System.out.println(notas1);

        Iterator<Double> iterator2 = notas1.iterator();
        Double menorSete = 0.0;
        while (iterator2.hasNext()) {
            Double next = iterator2.next();
            if (next < 7) {
                menorSete += next;
            }
        }
        System.out.println(menorSete);

        // notas1.clear();
        System.out.println(notas1);

        Iterator<Double> iterator3 = notas1.iterator();
        List<Double> notas1LinkedList = new LinkedList<>();
        while (iterator3.hasNext()) {
            Double next = iterator3.next();
            notas1LinkedList.add(next);
        }
        System.out.println(notas1LinkedList);
    }
}