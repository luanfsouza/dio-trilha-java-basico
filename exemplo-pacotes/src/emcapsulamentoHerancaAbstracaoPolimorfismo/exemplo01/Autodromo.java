package emcapsulamentoHerancaAbstracaoPolimorfismo.exemplo01;

public class Autodromo {

    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("311331");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("555554");
        z400.ligar();

        Veiculo coringa = z400;
        coringa.ligar();
    }
}