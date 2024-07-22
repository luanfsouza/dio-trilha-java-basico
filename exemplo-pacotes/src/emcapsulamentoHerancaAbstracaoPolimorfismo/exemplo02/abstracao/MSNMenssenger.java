package emcapsulamentoHerancaAbstracaoPolimorfismo.exemplo02.abstracao;

public class MSNMenssenger extends AppMensageiro {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("MSN esta enviando a mensagem...");
        
    }

    @Override
    public void receberMensagem() {
        System.out.println("MSN esta enviando a mensagem...");
        salvarHistoricoMensagem();
        
    }
    
}
