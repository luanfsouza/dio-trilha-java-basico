package emcapsulamentoHerancaAbstracaoPolimorfismo.exemplo02.abstracao;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        MSNMenssenger msn = new MSNMenssenger();
        FacabookMessenger face = new FacabookMessenger();
        Telegram telegram = new Telegram();

        msn.enviarMensagem();
        face.enviarMensagem();
        telegram.enviarMensagem();
    }
}
