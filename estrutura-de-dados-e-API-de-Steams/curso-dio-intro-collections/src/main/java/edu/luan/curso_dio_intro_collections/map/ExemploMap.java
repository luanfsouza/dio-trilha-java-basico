package edu.luan.curso_dio_intro_collections.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class ExemploMap {
    public static void main(String[] args) {
        Map<String, Double> carrosPopulares = new HashMap<>() {
            {
                put("gol", 14.4);
                put("uno", 15.6);
                put("mobi", 16.1);
                put("hb20", 14.5);
                put("kwid", 15.6);
            }
        };
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(carrosPopulares);

        System.out.println(carrosPopulares);

        carrosPopulares.put("gol", 16.1);
        System.out.println(carrosPopulares);

        System.out.println(carrosPopulares.containsKey("uno"));

        System.out.println("consumo do uno " + carrosPopulares.get("uno"));

        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";
        for (Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println(modeloMaisEficiente);
            }
        }

        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        Set<Entry<String, Double>> entries2 = carrosPopulares.entrySet();
        for(Entry<String, Double> entry : entries2){
            if(entry.getValue() == consumoMenosEficiente){
                modeloMenosEficiente = entry.getKey();
                System.out.println(modeloMenosEficiente);
            }
        }

        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
            soma+= iterator.next();
        }
        System.out.println(soma);

        Iterator<Double> iterator2 = carrosPopulares.values().iterator();
        while (iterator2.hasNext()) {
            if(iterator2.next().equals(15.6)) iterator2.remove();
        }
        System.out.println(carrosPopulares);

        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2);

        carrosPopulares2.clear();
        System.out.println(carrosPopulares2.isEmpty());
    }
}
