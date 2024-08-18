package dio.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import dio.springboot.app.SistemaMensageria;

@SpringBootApplication
public class SpringPrimeirosPassos {
    public static void main(String[] args) {
        SpringApplication.run(SpringPrimeirosPassos.class, args);
    }
    @Bean
    public CommandLineRunner run(SistemaMensageria sistema) throws Exception{
        return args -> {
            sistema.enviarConfirmacaoCadastro();
            sistema.enviarMensagemBoasVindas();
            sistema.enviarConfirmacaoCadastro();
        };
    }
}
