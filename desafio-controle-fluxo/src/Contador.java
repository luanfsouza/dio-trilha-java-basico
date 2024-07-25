import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int primeiroValor = scanner.nextInt();
        int segundoValor = scanner.nextInt();
        scanner.close(); 
        
        try {
            contar(primeiroValor, segundoValor);
        } catch (ParametrosInvalidosException e) {
            // TODO Auto-generated catch block
            System.err.println("O segundo parâmetro deve ser maior que o primeiro: "+e);
            e.printStackTrace();
        }
    }

    public static void contar(int v1, int v2) throws ParametrosInvalidosException {
        if (v1 > v2) {
            throw new ParametrosInvalidosException();
        } else {
            int contagem = v2 - v1;
            for (int x = 0; x < contagem; x++) {
                System.out.println("Imprimindo contagem "+(x+1)+"...");
            }
        }
        
    }
}
