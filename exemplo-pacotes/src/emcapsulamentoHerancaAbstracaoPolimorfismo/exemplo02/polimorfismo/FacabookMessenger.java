package emcapsulamentoHerancaAbstracaoPolimorfismo.exemplo02.polimorfismo;

public class FacabookMessenger extends AppMensageiro{

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Facebook esta enviando a mensagem...");
        salvarHistoricoMensagem();
        
    }

    @Override
    public void receberMensagem() {
        System.out.println("Facebook esta recebendo a mensagem...");
        
    }
    
}
