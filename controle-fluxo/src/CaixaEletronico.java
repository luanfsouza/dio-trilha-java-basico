public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 172.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println(saldo);
        } else {
            System.out.println("o valor "+valorSolicitado+" é maior que o saldo.");
        }
    }
}
