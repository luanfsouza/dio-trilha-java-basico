import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        do {
            System.out.println("Tocando... ");
            
        } while (tocando() == false);
        System.out.println("Atendeu...");
    }
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3) == 1;
        
        return atendeu;
        
    }
}
