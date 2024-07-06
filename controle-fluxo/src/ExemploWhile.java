import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
           
            double valorProduto = valorAleatorio();

            if (mesada - valorProduto > 0) {
                mesada -= valorProduto;
                System.out.println("mesada atual: " + mesada);
            } else {
                break;
            }
        }
        System.out.println("sem mais dinheiro: " + mesada);
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
