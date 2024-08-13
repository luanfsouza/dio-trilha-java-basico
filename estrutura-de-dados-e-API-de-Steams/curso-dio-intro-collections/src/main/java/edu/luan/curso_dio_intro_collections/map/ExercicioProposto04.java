package edu.luan.curso_dio_intro_collections.map;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;

public class ExercicioProposto04 {
    public static void main(String[] args) {
        Map<Integer, Contato> agendaTelefonica = new LinkedHashMap<>() {
            {
                put(1, new Contato("Simba", 2222));
                put(4, new Contato("Cami", 5555));
                put(3, new Contato("Jon", 1111));
            }
        };
        Set<Entry<Integer, Contato>> entries = agendaTelefonica.entrySet();
        for (Entry<Integer, Contato> entry : entries) {
            System.out.println("ID: " + entry.getKey() + ", Nome: " + entry.getValue().getNome());
        }

        System.out.println("----- ordem ID -----");
        Map<Integer, Contato> agendaTelefonicaOrdemId = new TreeMap<>(agendaTelefonica);
        System.out.println(agendaTelefonicaOrdemId);

        Set<Entry<Integer, Contato>> agendaTelefonica2 = agendaTelefonica.entrySet();
        System.out.println("----- ordem Numero Telefone -----");
        Set<Entry<Integer, Contato>> agendaTelefonicaOrdemNumeroTelefone = new TreeSet<>(new OrdemNumeroTelefone());
        agendaTelefonicaOrdemNumeroTelefone.addAll(agendaTelefonica2);
        System.out.println(agendaTelefonicaOrdemNumeroTelefone);

        System.out.println("----- ordem Nome -----");
        Set<Entry<Integer, Contato>> agendaTelefonicaOrdemNome = new TreeSet<>(new OrdemNome());
        agendaTelefonicaOrdemNome.addAll(agendaTelefonica2);
        System.out.println(agendaTelefonicaOrdemNome);

    }
}
class OrdemNome implements Comparator<Entry<Integer, Contato>>{

    @Override
    public int compare(Entry<Integer, Contato> o1, Entry<Integer, Contato> o2) {
        return o1.getValue().getNome().compareTo(o2.getValue().getNome());
    }

}
class OrdemNumeroTelefone implements Comparator<Entry<Integer, Contato>>{

    @Override
    public int compare(Entry<Integer, Contato> o1, Entry<Integer, Contato> o2) {
        return Integer.compare(o1.getValue().getNumero(), o2.getValue().getNumero());
    }

}
class OrdemId implements Comparator<Entry<Integer, Contato>>{

    @Override
    public int compare(Entry<Integer, Contato> o1, Entry<Integer, Contato> o2) {
        return o1.getKey().compareTo(o2.getKey());
    }

}
class Contato {
    private String nome;
    private int numero;

    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Contato [nome=" + nome + ", numero=" + numero + "]";
    }

}