package lanchonete;

public class Cozinheiro {
    public void adicionarLancheNoBalcao() {
        System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGER NO BALCAO");
    }

    public void adicioanrSucoNoBalcao() {
        System.out.println("ADICIONANDO SUCO NO BALCAO");
    }

    public void adicionarComboNoBalcao() {
        adicionarLancheNoBalcao();
        adicioanrSucoNoBalcao();
    }

    public void prepararLanche() {
        System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");
    }

    public void prepararVitamina() {
        System.out.println("PREPARANDO VITAMINA");
    }

    public void prepararCombo() {
        prepararLanche();
        prepararVitamina();
    }

    public void selecionarIngredientesLanche() {
        System.out.println("SELECIONANDO O PAO, SALADA, OVO E CARNE");
    }
    public void selecionarIngredientesSuco() {
        System.out.println("SELECIONANDO FRUTA, LEITE E SUCO");
    }
    public void lavarIngredientes() {
        System.out.println("LAVANDO OS INGREDIENTES");
    }

    public void baterVitaminaLiquitificador() {
        System.out.println("BATENDO VITAMINA LIQUIDIFICADOR");
    }
    public void fritarIngredientesLanche() {
        System.out.println("FRITANDO A CARNE E OVO PARA HAMBURGUER");
    }
    public void pedirParaTrocarGas(Atendente meuAmigo) {
        meuAmigo.trocarGas();
    }

    public void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }

    public void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }

    
}
