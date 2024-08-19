package dio.aula;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.aula.model.User;
import dio.aula.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {

        List<User> users = repository.findByNameAndPassword("GLEYSON", "glys123");
        System.out.println("------------------------------------------");
        for(User u: users){
            System.out.println(u);
        }
        System.out.println("------------------------------------------");
    }
}
