package edu.luan.curso_dio_intro_collections.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {
        System.out.println("----- ordem aleatoria -----");
        Map<String, Livro> meusLivros = new HashMap<>() {
            {
                put("Hanking, Stephen", new Livro("Uma Breve Historia do Tempo", 256));
                put("Duhigg, Charles", new Livro("O Poder do Habito", 408));
                put("Harari, Yuval Noah", new Livro("21 Licoes Para o Seculo 21", 432));
            }
        };
        System.out.println("-------- professora ----------");
        for (Entry<String, Livro> livro : meusLivros.entrySet()) {
            System.out.println(livro.getKey() + ", " + livro.getValue().getNome());
        }
        System.out.println("-------- eu ----------");
        meusLivros.forEach(
                (String autor, Livro livro) -> System.out.println("autor: " + autor + ", livro: " + livro.getNome()));

        System.out.println("-------- ordem alfabetica autores ----------");
        Map<String, Livro> meusLivrosOrdenados = new TreeMap<>(meusLivros);
        for (Entry<String, Livro> livro : meusLivrosOrdenados.entrySet()) {
            System.out.println("autor: " + livro.getKey() + ", livro: " + livro.getValue().getNome());
        }

        System.out.println("-------- ordem alfabetica nome livros ----------");
        Set<Entry<String, Livro>> meusLivrosOrdenadosNomeLivro = new TreeSet<>(new OrdemAlfabeticaNomeLivro());
        meusLivrosOrdenadosNomeLivro.addAll(meusLivros.entrySet());
        for (Entry<String, Livro> livro : meusLivrosOrdenadosNomeLivro) {
            System.out.println("livro: " + livro.getValue().getNome());
        }
    }
}

class OrdemAlfabeticaNomeLivro implements Comparator<Entry<String, Livro>> {

    @Override
    public int compare(Entry<String, Livro> o1, Entry<String, Livro> o2) {
        return o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());
    }

}

class Livro {
    private String nome;
    private int paginas;

    public Livro(String nome, int paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + paginas;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Livro other = (Livro) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (paginas != other.paginas)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Livro [nome=" + nome + ", paginas=" + paginas + "]";
    }

}