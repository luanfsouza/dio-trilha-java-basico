public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV esta ligada? " + smartTv.ligada);
        System.out.println("Canal  " + smartTv.canal);
        System.out.println("Volume atuatualal " + smartTv.volume);
        System.out.println(new Calc().calcular(4, 2));
    }
}
