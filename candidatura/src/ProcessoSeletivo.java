import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        System.out.println("Processo seletivo!");
        String[] candidatosSelecionados = { "FELIPE", "MARCELO", "LUCAS", "CAMILA" };
        for (String candidato : candidatosSelecionados) {

            int tentativas = 0;

            while (tentativas < 3) {
                boolean atendeu = new Random().nextInt(3) == 1;
                if (!atendeu) {
                    System.out.println("O candidato: " + candidato + " não atendeu a ligação...");
                    tentativas++;
                } else {
                    break;
                }
            }

            if (tentativas == 3) {
                System.out.println("O candidato: " + candidato + " esta fora do processo seletivo.");
            } else {
                System.out.println("Candidato: " + candidato + " ligações: " + (tentativas+1));
            }
        }
    }

    public static void selecaoCandidato() {
        String[] candidatos = { "MARIA", "JOAO", "FELIPE", "MARCELO", "LUCAS", "CAMILA", "FERNANDA", "RICARDO" };
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPredentido = valorPretendido();
            if (salarioPredentido <= salarioBase) {
                System.out.println("O candidato " + candidato + " foi selecionado!");
                candidatosSelecionados++;
            }
            System.out.println(candidatoAtual + " - O candidato " + candidato + " solicitou este valor de salario: "
                    + salarioPredentido);
            candidatoAtual++;
        }
        System.out.println("CANDIDATOS SELECIONADOS: " + candidatosSelecionados);
    }

    public static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    public static void analisarCandidato(double salarioPredentido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPredentido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPredentido) {
            System.out.println("Ligar para o candidato e fazer uma contra proposta");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}
