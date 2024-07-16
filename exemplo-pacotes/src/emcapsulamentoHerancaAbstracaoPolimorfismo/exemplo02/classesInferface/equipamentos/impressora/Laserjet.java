package emcapsulamentoHerancaAbstracaoPolimorfismo.exemplo02.classesInferface.equipamentos.impressora;

public class Laserjet implements Impressora{
    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO LASERJET");
    }
}
