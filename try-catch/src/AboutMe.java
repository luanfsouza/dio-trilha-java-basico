import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        try {
            System.out.println("===>>> Digite o seu nome <<<===");
            String nome = scanner.next();

            System.out.println("===>>> Digite o seu sobrenome <<<===");
            String sobrenome = scanner.next();
 
            System.out.println("===>>> Digite a sua idade <<<===");
            int idade = scanner.nextInt();

            System.out.println("===>>> Digite a sua altura <<<===");
            double altura = scanner.nextDouble();

            System.out.printf("Olá me chamo %s %s, eu tenho %d anos, e a minha altura é %.2f cm. \n", nome, sobrenome,
                    idade,
                    altura);
            scanner.close();
        } catch (InputMismatchException e) {
            System.err.println("Os campos 'idade' e 'altura' precisam ser númericos.");
        }

    }
}
