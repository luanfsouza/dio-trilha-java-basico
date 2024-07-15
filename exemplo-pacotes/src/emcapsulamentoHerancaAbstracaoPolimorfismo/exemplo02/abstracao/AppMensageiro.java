package emcapsulamentoHerancaAbstracaoPolimorfismo.exemplo02.abstracao;

public abstract class AppMensageiro {
    public abstract void enviarMensagem();

    public abstract void receberMensagem();

    private void validarConectadoInternet() {
        System.out.println("Validando a conexão com a internet");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o historico de mensagem");
    }
}
