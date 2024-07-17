package emcapsulamentoHerancaAbstracaoPolimorfismo.exemplo03.desafioDioBanco;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }
    @Override
    public void informarExtrato() {
        System.out.println("===>>> informações da conta poupança <<<===");
        super.informarExtrato();
    }
   
}
