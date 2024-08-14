package edu.luan.curso_dio_intro_collections.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ExercicioPropostoSteamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios = new ArrayList<>(Arrays.asList("1", "0", "4", "1", "2", "3", "9", "6", "5"));
        // interface funcional
        numerosAleatorios.forEach(new Consumer<String>() {
            @Override
            public void accept(String t) {
                System.out.println(t);
            }
        });
        // lambda
        numerosAleatorios.forEach(t -> System.out.println(t));
        // reference method
        numerosAleatorios.forEach(System.out::println);

        System.out.println("------- colocar 5 primeiros numeros em um set ---------");
        numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);

        System.out.println("------- transformar a lista de String para Integer ---------");
        List<Integer> numerosaleatoriosInteiros = numerosAleatorios.stream().map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(numerosaleatoriosInteiros);

        System.out.println("------- Pegue os numeros pares e maiores que 2 e coloque em uma lista ---------");
        List<Integer> parMaiorDois = numerosAleatorios.stream().map(Integer::parseInt).filter(t -> t % 2 == 0 && t > 2)
                .collect(Collectors.toList());
        System.out.println(parMaiorDois);

        System.out.println("------- Mostrar media ---------");
        numerosAleatorios.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out::println);

        System.out.println("------- Remover os valores impares da fonte ---------");
        List<Integer> numerosaleatoriosInteirosImpares = numerosAleatorios.stream().map(Integer::parseInt)
                .collect(Collectors.toList());
        numerosaleatoriosInteirosImpares.removeIf( t -> t % 2 != 0);
        System.out.println(numerosaleatoriosInteirosImpares);
    }
}
