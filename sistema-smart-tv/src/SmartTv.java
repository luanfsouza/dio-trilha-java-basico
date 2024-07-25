public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    
    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }
 
    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }
    public int mudarCanal(int canalEscolhido) {
        canal = canalEscolhido;
        return canal;
    }

    public void aumentarVolume() {
        volume++;
    }
    public void abaixarVolume() {
        volume--;
    }
}
 