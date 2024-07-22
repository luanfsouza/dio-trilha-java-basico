package emcapsulamentoHerancaAbstracaoPolimorfismo.exemplo02.abstracao;

public class FacabookMessenger extends AppMensageiro{

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Facebook esta enviando a mensagem...");
        
        
    }

    @Override
    public void receberMensagem() {
        System.out.println("Facebook esta recebendo a mensagem...");
        salvarHistoricoMensagem();
        
    }
    
}
