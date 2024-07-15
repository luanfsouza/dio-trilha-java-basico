package emcapsulamentoHerancaAbstracaoPolimorfismo.exemplo02.abstracao;

public class Telegram extends AppMensageiro{

    @Override
    public void enviarMensagem() {
        System.out.println("Telegram esta enviando a mensagem...");
        
    }

    @Override
    public void receberMensagem() {
        System.out.println("Telegram esta enviando a mensagem...");
        
    }
    
}
