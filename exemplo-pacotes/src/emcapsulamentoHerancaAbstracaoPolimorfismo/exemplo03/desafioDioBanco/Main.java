package emcapsulamentoHerancaAbstracaoPolimorfismo.exemplo03.desafioDioBanco;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Cliente luan = new Cliente();
        luan.setNome("luan");
        Cliente joao = new Cliente();
        joao.setNome("joao");
        
        Conta conta1 = new ContaCorrente(luan);
        Conta conta2 = new ContaPoupanca(joao);

        conta1.depositar(20);
        conta2.depositar(10);
        conta1.transferir(5, conta2);

        conta2.informarExtrato();
        conta1.informarExtrato();

        List<Conta> contas = new ArrayList<>();
        contas.add(conta1);
        contas.add(conta2);
        
        Banco satander = new Banco();
        satander.setContas(contas);

        satander.getContas().stream()
        .forEach(t -> System.out.println(t.cliente.getNome()));
    
    }
}
