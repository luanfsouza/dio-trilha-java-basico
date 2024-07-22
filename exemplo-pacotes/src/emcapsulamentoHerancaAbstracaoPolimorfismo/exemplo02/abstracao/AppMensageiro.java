package emcapsulamentoHerancaAbstracaoPolimorfismo.exemplo02.abstracao;

public abstract class AppMensageiro {
    public abstract void enviarMensagem();

    public abstract void receberMensagem();

    protected void validarConectadoInternet() {
        System.out.println("Validando a conexão com a internet");
    }

    protected void salvarHistoricoMensagem() {
        System.out.println("Salvando o historico de mensagem");
    }
}
