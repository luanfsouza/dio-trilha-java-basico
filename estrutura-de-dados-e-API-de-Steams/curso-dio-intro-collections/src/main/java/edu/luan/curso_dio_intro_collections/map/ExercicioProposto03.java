package edu.luan.curso_dio_intro_collections.map;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class ExercicioProposto03 {
    public static void main(String[] args) {
        Map<String, Integer> estadosNordeste = new LinkedHashMap<>() {
            {
                put("PE", 9616621);
                put("AL", 3351543);
                put("CE", 9187103);
                put("RN", 3534265);
            }
        };
        System.out.println(estadosNordeste);

        estadosNordeste.put("RN", 3534165);
        System.out.println(estadosNordeste);

        if (!estadosNordeste.containsKey("PB")) {
            estadosNordeste.put("PB", 4039277);
            System.out.println(estadosNordeste);
        }

        System.out.println("PB - " + estadosNordeste.get("PE"));

        Map<String, Integer> estadosNordesteAlfabetico = new TreeMap<>(estadosNordeste);
        System.out.println(estadosNordesteAlfabetico);

        int menorPopulacao = Collections.min(estadosNordesteAlfabetico.values());
        int maiorPopulacao = Collections.max(estadosNordesteAlfabetico.values());
        Set<Entry<String, Integer>> entries = estadosNordesteAlfabetico.entrySet();

        for (Entry<String, Integer> entry : entries) {
            if (entry.getValue().equals(menorPopulacao)) {
                System.out.println(entry.getKey() + " --- " + entry.getValue());
            }
            if (entry.getValue().equals(maiorPopulacao)) {
                System.out.println(entry.getKey() + " --- " + entry.getValue());
            }
        }

        Iterator<Integer> iterator = estadosNordesteAlfabetico.values().iterator();
        int soma = 0;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("soma das populacoes: " + soma);

        Iterator<Integer> iterator2 = estadosNordeste.values().iterator();
        while (iterator2.hasNext()) {
            if (iterator2.next() < 4000000)
                iterator2.remove();
        }
        System.out.println("----- acima 4.000.000 ----");
        System.out.println(estadosNordeste);

        estadosNordeste.clear();
        System.out.println(estadosNordeste);

        Random random = new Random();

        Map<String, Integer> comjuntoDado = new LinkedHashMap<>();
        for (int i = 0; i < 100; i++) {
            int dadoAleatorio = random.nextInt(6) + 1;
            comjuntoDado.put(Integer.toString(i), dadoAleatorio);
        }
        System.out.println(comjuntoDado);

        Iterator<Integer> iterator3 = comjuntoDado.values().iterator();
        Map<String, Integer> numerosRepetidosConjuntoDado = new LinkedHashMap<>() {
            {
                put("um", 0);
                put("dois", 0);
                put("tres", 0);
                put("quatro", 0);
                put("cinco", 0);
                put("seis", 0);
            }
        };
        while (iterator3.hasNext()) {
            Integer next = iterator3.next();
            if (next == 1)
                numerosRepetidosConjuntoDado.put("um", numerosRepetidosConjuntoDado.get("um") + 1);
            if (next == 2)
                numerosRepetidosConjuntoDado.put("dois", numerosRepetidosConjuntoDado.get("dois") + 1);
            if (next == 3)
                numerosRepetidosConjuntoDado.put("tres", numerosRepetidosConjuntoDado.get("tres") + 1);
            if (next == 4)
                numerosRepetidosConjuntoDado.put("quatro", numerosRepetidosConjuntoDado.get("quatro") + 1);
            if (next == 5)
                numerosRepetidosConjuntoDado.put("cinco", numerosRepetidosConjuntoDado.get("cinco") + 1);
            if (next == 6)
                numerosRepetidosConjuntoDado.put("seis", numerosRepetidosConjuntoDado.get("seis") + 1);
        }
        System.out.println(" dado 1 foi jogado: " + numerosRepetidosConjuntoDado.get("um")
                + " vezes.\n dado 2 foi jogado: " + numerosRepetidosConjuntoDado.get("dois")
                + " vezes.\n dado 3 foi jogado: " + numerosRepetidosConjuntoDado.get("tres")
                + " vezes.\n dado 4 foi jogado: " + numerosRepetidosConjuntoDado.get("quatro")
                + " vezes.\n dado 5 foi jogado: " + numerosRepetidosConjuntoDado.get("cinco")
                + " vezes.\n dado 6 foi jogado: " + numerosRepetidosConjuntoDado.get("seis") + " vezes.\n");
    }
}
