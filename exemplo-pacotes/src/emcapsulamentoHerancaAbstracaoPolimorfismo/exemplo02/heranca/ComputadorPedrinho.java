package emcapsulamentoHerancaAbstracaoPolimorfismo.exemplo02.heranca;

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
