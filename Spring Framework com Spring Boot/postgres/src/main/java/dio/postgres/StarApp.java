package dio.postgres;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.postgres.model.Alunos;
import dio.postgres.repository.AlunosRepository;

@Component
public class StarApp implements CommandLineRunner {
    @Autowired
    AlunosRepository repository;

    public void run(String... args) throws Exception {
        Alunos aluno = new Alunos();
        aluno.setIdade(10);
        aluno.setMatricula(1323313);
        aluno.setNome("enrico");

       // repository.save(aluno);

        System.out.println("------------------------------------------");
        //System.out.println(repository.findByNome("Marcelo"));
        // for(Alunos u: repository.findAll()){
        //     System.out.println(u);
        // }
        System.out.println(repository.findById(1252));
        System.out.println("------------------------------------------");
    }
}
