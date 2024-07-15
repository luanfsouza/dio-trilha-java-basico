package construtores;

public class Pessoa {
    private String nome;
    private int cpf;
    private String endereco;

    public Pessoa(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Pessoa() {
    }

    public Pessoa(String nome, int cpf, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    

    public String getNome() {
        return this.nome;
    }

    public int getCpf() {
        return this.cpf;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
