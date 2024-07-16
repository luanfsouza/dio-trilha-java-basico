package emcapsulamentoHerancaAbstracaoPolimorfismo.exemplo02.polimorfismo;

public class MSNMenssenger extends AppMensageiro {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("MSN esta enviando a mensagem...");
        salvarHistoricoMensagem();
    }

    @Override
    public void receberMensagem() {
        System.out.println("MSN esta enviando a mensagem...");
        
    }
    
}
