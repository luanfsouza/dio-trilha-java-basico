package emcapsulamentoHerancaAbstracaoPolimorfismo.exemplo02.emcapsulamento;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        MSNMenssenger msn = new MSNMenssenger();

        msn.enviarMensagem();

        msn.receberMensagem();
    }
}
