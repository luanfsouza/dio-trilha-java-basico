package edu.luan.curso_dio_intro_collections.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
    public static void main(String[] args) {
        Set<Double> notas = new HashSet<>(Arrays.asList(3.4, 63.1, 9.0, 15.6, 1.2, 6.5, 9.0));
        System.out.println(notas.toString());

        System.out.println(notas.contains(6.5));

        System.out.println(Collections.min(notas));
        System.out.println(Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        notas.remove(6.5);
        System.out.println(notas);

        Iterator<Double> iterator2 = notas.iterator();
        while (iterator2.hasNext()) {
            Double next = iterator2.next();
            if (next < 7)
                iterator2.remove(); 
        }
        System.out.println(notas);

        Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(3.4, 63.1, 9.0, 15.6, 1.2, 6.5, 9.0, 1.2));
        System.out.println(notas2);

        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

    }
}
