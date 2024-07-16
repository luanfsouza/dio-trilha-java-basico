package emcapsulamentoHerancaAbstracaoPolimorfismo.exemplo02.polimorfismo;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        AppMensageiro appMensageiro = null;
        String appEscolhido = "???";
        appEscolhido = "fcb";

        if (appEscolhido.equals("msn")) {
            appMensageiro = new MSNMenssenger();
        } else if (appEscolhido.equals("fcb")) {
            appMensageiro = new FacabookMessenger();
        } else if (appEscolhido.equals("tlg")) {
            appMensageiro = new Telegram();
        }
        
        appMensageiro.enviarMensagem();
    }
}
