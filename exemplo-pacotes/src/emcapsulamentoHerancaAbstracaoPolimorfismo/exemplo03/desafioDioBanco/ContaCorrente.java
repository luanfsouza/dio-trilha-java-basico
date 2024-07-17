package emcapsulamentoHerancaAbstracaoPolimorfismo.exemplo03.desafioDioBanco;

public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void informarExtrato() {
        System.out.println("===>>> informações da conta corrente <<<===");
        super.informarExtrato();
    }
    
}
