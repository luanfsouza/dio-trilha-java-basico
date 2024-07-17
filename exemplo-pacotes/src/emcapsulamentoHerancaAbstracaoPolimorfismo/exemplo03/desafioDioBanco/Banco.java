package emcapsulamentoHerancaAbstracaoPolimorfismo.exemplo03.desafioDioBanco;

import java.util.List;

public class Banco {
    public String nome;
    public List<Conta> contas;

    public List<Conta> getContas() {
        
           return contas; 
    }
    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
    
}
