package emcapsulamentoHerancaAbstracaoPolimorfismo.exemplo02.polimorfismo;

public class Telegram extends AppMensageiro{

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Telegram esta enviando a mensagem...");
        salvarHistoricoMensagem();
    }

    @Override
    public void receberMensagem() {
        System.out.println("Telegram esta enviando a mensagem...");
        
    }
    
}
