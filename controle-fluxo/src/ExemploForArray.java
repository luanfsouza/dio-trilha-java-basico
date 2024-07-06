public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "Joao", "Marcos", "Luiza", "Valeria" };
        for (int x = 0; x < alunos.length; x++) {
            System.out.println("Aluno no indice x=" + x + " é " + alunos[x]);
        }

        for(String aluno : alunos){
            System.out.println("O nome do aluno(a) é: " + aluno);
        }
    }
}
