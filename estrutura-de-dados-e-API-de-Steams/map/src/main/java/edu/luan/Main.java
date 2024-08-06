package edu.luan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> aluno = new HashMap<>();
        aluno.put("nome", "João");
        aluno.put("idade", "17");
        aluno.put("Media", "8.0");
        aluno.put("turma", "3a");

        Map<String, String> aluno2 = new HashMap<>();
        aluno2.put("nome", "Pedro");
        aluno2.put("idade", "30");
        aluno2.put("Media", "4.2");
        aluno2.put("turma", "1a");

        System.out.println(aluno);

        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        List<Map<String, String>> listaAlunos = new ArrayList<>();

        listaAlunos.add(aluno);
        listaAlunos.add(aluno2);

        System.out.println(listaAlunos);

        System.out.println(aluno2.containsKey("idade"));
}}