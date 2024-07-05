import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("===> Bem vindo ao banco JAVA! <===");

        System.out.printf("===> Qual numero da conta? <=== \n");
        numero = scanner.nextInt();

        System.out.printf("===> Qual a agencia da conta? <=== \n");
        agencia = scanner.next();

        System.out.printf("===> Qual o seu nome? <=== \n");
        nomeCliente = scanner.next();

        System.out.printf("===> Qual o valor do saldo para deposito? <=== \n");
        saldo = scanner.nextDouble();

        System.out.printf("...processando, aguarde...\n");

        System.out.printf("Parabens, conta criada com sucesso, aqui estão os dados da conta \n |... Usuario: %s ...| \n |... Numero: %d...| \n |... Agencia: %s ...| \n |... Saldo: %.2f ...| \n", nomeCliente, numero, agencia, saldo);
    }
}
