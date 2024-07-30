public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String A = "uva";
        String B = "melancia";

        String resultado = A == B ? "verdadeiro" : "falso";

        System.out.println(resultado);
        String nome = "luan";
        String meuNome = new String("luan");
        System.out.println("nome: " + nome + " meuNome: " + meuNome);
        System.out.println(nome.equals(meuNome));
    }
}
