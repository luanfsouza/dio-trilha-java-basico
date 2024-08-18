package dio.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import dio.springboot.app.ConversorJson;
import dio.springboot.app.ViaCep;

@SpringBootApplication
class SpringPrimeirosPassos {
    public static void main(String[] args) {
        SpringApplication.run(SpringPrimeirosPassos.class, args);
    }

    @Bean
    public CommandLineRunner run(ConversorJson conversor) throws Exception {
        return args -> {
            String json = "{\"cep\": \"01001-00\", \"logradouro\": \"Praça da Sé\", \"localidade\": \"Bahia\"}";
            ViaCep response = conversor.converter(json);
            System.out.println("Dados do CEP: " + response);
        };
    }

}
