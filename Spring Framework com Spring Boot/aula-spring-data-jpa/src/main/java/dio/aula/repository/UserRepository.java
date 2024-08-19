package dio.aula.repository;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;

import dio.aula.model.User;

@Configuration
@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User, Integer> {
    //Query method
    List<User> findByNameContaining(String name);

    //Query method
    List<User> findByUsername(String username);

    //Query method
    @Override
    default void deleteAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
    }

    //Query Override
    @Query("SELECT u FROM User u WHERE u.name LIKE %:name%")
    List<User> filtrarPorNome(@Param("name") String name);

    List<User> findByNameAndPassword(String name, String password);
}