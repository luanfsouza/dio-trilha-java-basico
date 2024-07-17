package emcapsulamentoHerancaAbstracaoPolimorfismo.exemplo03.desafioDioBanco;

public interface IConta {
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, Conta contaDestino);
    void informarExtrato();
}
