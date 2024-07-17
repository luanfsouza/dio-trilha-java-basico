package emcapsulamentoHerancaAbstracaoPolimorfismo.exemplo03.desafioDioBanco;

public abstract class Conta implements IConta {
    
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    
    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;    
    }
    
    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return this.agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public double getSaldo() {
        return this.saldo;
    }
    public void setSaldo(double valor){
        this.saldo += valor;
    }
    public void informarExtrato(){
        System.out.format("Titular da conta: %s\n", this.cliente.getNome());
        System.out.format("Agencia: %d\n", this.agencia);
        System.out.format("Numero: %d\n", this.numero);
        System.out.format("Agencia: %.2f\n", this.saldo);
    }
}
