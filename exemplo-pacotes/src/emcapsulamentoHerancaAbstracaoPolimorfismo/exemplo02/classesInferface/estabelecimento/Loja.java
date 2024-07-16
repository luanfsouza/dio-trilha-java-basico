package emcapsulamentoHerancaAbstracaoPolimorfismo.exemplo02.classesInferface.estabelecimento;

import emcapsulamentoHerancaAbstracaoPolimorfismo.exemplo02.classesInferface.equipamentos.copiadora.Copiadora;
import emcapsulamentoHerancaAbstracaoPolimorfismo.exemplo02.classesInferface.equipamentos.digitalizadora.Digitalizadora;
import emcapsulamentoHerancaAbstracaoPolimorfismo.exemplo02.classesInferface.equipamentos.impressora.Deskjet;
import emcapsulamentoHerancaAbstracaoPolimorfismo.exemplo02.classesInferface.equipamentos.impressora.Impressora;
import emcapsulamentoHerancaAbstracaoPolimorfismo.exemplo02.classesInferface.equipamentos.impressora.Laserjet;
import emcapsulamentoHerancaAbstracaoPolimorfismo.exemplo02.classesInferface.equipamentos.multifuncional.EquipamentoFuncional;

public class Loja {
    public static void main(String[] args) {
        Impressora impressora1 = new Deskjet();
        Impressora impressora2 = new Laserjet();
        EquipamentoFuncional em = new EquipamentoFuncional();
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora1.imprimir();
        impressora2.imprimir();
        em.digitalizar();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
