package emcapsulamentoHerancaAbstracaoPolimorfismo.exemplo02.heranca;

public class AppMensageiro {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
    }

    private void validarConectadoInternet() {
        System.out.println("Validando a conexão com a internet");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o historico de mensagem");
    }
}
