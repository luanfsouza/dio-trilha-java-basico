package dio.springboot.app;

public class Remetente {
    private String nome;
    private String email;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Remetente [nome=" + nome + ", email=" + email + "]";
    }
    

}
