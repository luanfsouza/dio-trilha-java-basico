package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        felipe.setNome("Felipe");
        felipe.setIdade(5);;

        System.out.println("O aluno é "+felipe.getNome()+" e tem "+felipe.getIdade()+" anos");
    }

}
