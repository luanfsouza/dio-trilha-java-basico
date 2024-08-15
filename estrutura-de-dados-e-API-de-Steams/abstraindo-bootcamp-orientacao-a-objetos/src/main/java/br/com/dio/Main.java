package br.com.dio;

import java.time.LocalDate;

import br.com.dio.dominio.Bootcamp;
import br.com.dio.dominio.Curso;
import br.com.dio.dominio.Dev;
import br.com.dio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descricao mentoria java");
        mentoria1.setData(LocalDate.now());

        Bootcamp java = new Bootcamp();
        java.setNome("Bootcamp JAVA");
        java.setDescricao("aprendendo java");
        java.getConteudos().add(curso1);
        java.getConteudos().add(curso2);
        java.getConteudos().add(mentoria1);

        Dev marcos = new Dev();
        marcos.setNome("Marcos Costa");
        
        marcos.inscreverBootcamp(java);
        System.out.println(marcos.getConteudosInscritos());
        System.out.println(marcos.calcularTotalXp());
        marcos.progredir();
        marcos.progredir();
        System.out.println(marcos.getConteudosInscritos());
        System.out.println(java.getConteudos());
        marcos.progredir();
        System.out.println(marcos.calcularTotalXp());
    }
}