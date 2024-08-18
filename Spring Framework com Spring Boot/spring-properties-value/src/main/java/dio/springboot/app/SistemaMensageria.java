package dio.springboot.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensageria implements CommandLineRunner {
    @Value("${name}")
    private String nome;
    @Value("${email}}")
    private String email;
    @Value("${telefones}")
    private List<Integer> telefones;

    public void run(String... args) throws Exception {
        System.out.println("----------------------------------------");
        System.out.println("Mensagem enviada por: "+ this.nome + "\nE-mail: "+ this.email+"\nCom telefones para contato: "+this.telefones);

        System.out.println("Seu cadastro foi aprovado!");
        System.out.println("----------------------------------------");
    }
}
