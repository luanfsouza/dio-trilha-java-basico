import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("===>>> Digite o seu nome <<<===");
        String nomePessoa2 = scanner.next();

        System.out.println("===>>> Digite o seu sobrenome <<<===");
        String sobrenomePessoa2 = scanner.next();

        System.out.println("===>>> Digite a sua idade <<<===");
        int idadePessoa2 = scanner.nextInt();

        System.out.println("===>>> Digite a sua altura <<<===");
        double alturaPessoa2 = scanner.nextDouble();

        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.printf("Olá me chamo %s %s, eu tenho %d anos, e a minha altura é %.2f cm. \n", nome, sobrenome, idade,
                altura);
        System.out.printf("Olá me chamo %s %s, eu tenho %d anos, e a minha altura é %.2f cm. \n", nomePessoa2, sobrenomePessoa2, idadePessoa2,
                alturaPessoa2);
    }
}
