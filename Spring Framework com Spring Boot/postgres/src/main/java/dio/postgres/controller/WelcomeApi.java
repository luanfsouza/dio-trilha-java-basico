package dio.postgres.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class WelcomeApi {

    @GetMapping()
    public String welcomePage(){
        return "Bem vindo a pagina inicial.";
    }
}
