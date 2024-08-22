package dio.postgres.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "T_Alunos")
public class Alunos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "alunos_id")
    private Long id;
    @Column(length = 15, nullable = false)
    private int idade;
    @Column(length = 15, nullable = false)
    private int matricula;
    @Column(length = 50, nullable = false)
    private String nome;


    // public Alunos(String nome, int idade, int matricula) {

    //     this.nome = nome;
    //     this.idade = idade;
    //     this.matricula = matricula;
    // }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Alunos [id=" + id + ", nome=" + nome + ", idade=" + idade + ", matricula=" + matricula + "]";
    }

}
