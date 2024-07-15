package construtores;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("Marcos", 123456789);
        marcos.setEndereco("Avenida das Palmeiras, 345");

        System.out.println("Nome: "+marcos.getNome()+"\nEndereço: "+marcos.getEndereco()+"\nCPF: "+marcos.getCpf());
    }
}
 