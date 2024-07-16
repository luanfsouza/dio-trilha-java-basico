package emcapsulamentoHerancaAbstracaoPolimorfismo.exemplo02.classesInferface.equipamentos.multifuncional;

import emcapsulamentoHerancaAbstracaoPolimorfismo.exemplo02.classesInferface.equipamentos.copiadora.Copiadora;
import emcapsulamentoHerancaAbstracaoPolimorfismo.exemplo02.classesInferface.equipamentos.digitalizadora.Digitalizadora;
import emcapsulamentoHerancaAbstracaoPolimorfismo.exemplo02.classesInferface.equipamentos.impressora.Impressora;

public class EquipamentoFuncional implements Copiadora, Digitalizadora, Impressora{
    @Override
    public void copiar() {
        System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
    @Override
    public void digitalizar() {
        System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }

}
