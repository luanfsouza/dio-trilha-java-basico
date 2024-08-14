package edu.luan.curso_dio_intro_collections.stream;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ExercicioProposto041 {
    public static void main(String[] args) {
        Map<Integer, Contato> agendaTelefonica = new LinkedHashMap<>() {
            {
                put(1, new Contato("Simba", 2222));
                put(4, new Contato("Cami", 5555));
                put(3, new Contato("Jonn", 1111));
            }
        };
        Set<Entry<Integer, Contato>> entries = agendaTelefonica.entrySet();
        for (Entry<Integer, Contato> entry : entries) {
            System.out.println("ID: " + entry.getKey() + ", Nome: " + entry.getValue().getNome());
        }

        System.out.println("------------------- ordem ID ---------------------");
        Map<Integer, Contato> agendaTelefonicaOrdemId = new TreeMap<>(agendaTelefonica);
        System.out.println(agendaTelefonicaOrdemId);

        System.out.println("------------------ ordem Numero Telefone ----------");
        Set<Entry<Integer, Contato>> agendaTelefonica2 = agendaTelefonica.entrySet();
        Set<Entry<Integer, Contato>> agendaTelefonicaOrdemNumeroTelefone = new TreeSet<>(
                new Comparator<Entry<Integer, Contato>>() {
                    @Override
                    public int compare(Entry<Integer, Contato> o1, Entry<Integer, Contato> o2) {
                        return Integer.compare(o1.getValue().getNumero(), o2.getValue().getNumero());
                    }
                });
        agendaTelefonicaOrdemNumeroTelefone.addAll(agendaTelefonica.entrySet());
        System.out.println(agendaTelefonicaOrdemNumeroTelefone);

        Set<Entry<Integer, Contato>> agendaTelefonicaOrdemNumeroTelefone2 = new TreeSet<>(
                Comparator.comparing(new Function<Entry<Integer, Contato>, Integer>() {
                    @Override
                    public Integer apply(Entry<Integer, Contato> contatoEntry) {
                        return contatoEntry.getValue().getNumero();
                    }
                }));
        agendaTelefonicaOrdemNumeroTelefone2.addAll(agendaTelefonica2);
        System.out.println(agendaTelefonicaOrdemNumeroTelefone2);

        Set<Entry<Integer, Contato>> agendaTelefonicaOrdemNumeroTelefone3 = new TreeSet<>(Comparator.comparing(contatoEntry -> contatoEntry.getValue().getNumero()));
        agendaTelefonicaOrdemNumeroTelefone3.addAll(agendaTelefonica2);
        System.out.println(agendaTelefonicaOrdemNumeroTelefone3);

        System.out.println("----------------- ordem Nome ---------------");
        Set<Entry<Integer, Contato>> agendaTelefonicaOrdemNome = new TreeSet<>(
                new Comparator<Entry<Integer, Contato>>() {
                    @Override
                    public int compare(Entry<Integer, Contato> o1, Entry<Integer, Contato> o2) {
                        return o1.getValue().getNome().compareTo(o2.getValue().getNome());
                    }
                });
        agendaTelefonicaOrdemNome.addAll(agendaTelefonica2);
        System.out.println(agendaTelefonicaOrdemNome);

        Set<Entry<Integer, Contato>> agendaTelefonicaOrdemNome2 = new TreeSet<>(Comparator.comparing(new Function<Entry<Integer, Contato>, String>(){
            public String apply(Entry<Integer, Contato> contatoEntry){
                return contatoEntry.getValue().getNome();
            }
        }));
        agendaTelefonicaOrdemNome2.addAll(agendaTelefonica2);
        System.out.println(agendaTelefonicaOrdemNome2);

        Set<Entry<Integer, Contato>> agendaTelefonicaOrdemNome3 = new TreeSet<>(Comparator.comparing(contatoEntry -> contatoEntry.getValue().getNome()));
        agendaTelefonicaOrdemNome3.addAll(agendaTelefonica2);
        System.out.println(agendaTelefonicaOrdemNome3);

    }
}
class OrdemId implements Comparator<Entry<Integer, Contato>> {

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
