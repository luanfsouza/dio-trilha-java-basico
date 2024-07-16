package emcapsulamentoHerancaAbstracaoPolimorfismo.exemplo01;

public class Carro extends Veiculo{
    

    public void ligar() {
        conferirCambio();
        conferirCombustivel();
        System.out.println("CARRO LIGOU");
    }

    public void conferirCombustivel() {
        System.out.println("CONFERINDO COMBUSTIVEL");
    }

    public void conferirCambio() {
        System.out.println("CONFERINDO CAMBIO EM P");
    }
}
