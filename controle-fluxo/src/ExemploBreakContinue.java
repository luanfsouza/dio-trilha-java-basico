public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int x = 0; x <= 5; x++) {
            System.out.println(x);
            if (x == 3) {
                System.out.println(x);
                break;
            }
        }
    }
}
