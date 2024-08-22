package dio.postgres.repository;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import dio.postgres.model.Alunos;

@Configuration
@EnableJpaRepositories
public interface AlunosRepository extends JpaRepository<Alunos, Integer> {
    List<Alunos> findByNome(String nome);
}
