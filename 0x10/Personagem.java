import comida.Comida;
import humor.*;

public class Personagem {
    private int pontosDeFelicidade;
    private Humor objetoHumor;

    public Humor obterHumorAtual() {
        if (this.pontosDeFelicidade < -5) {
            this.objetoHumor = new Irritado();
        }
        else if (this.pontosDeFelicidade <= 0) {
            this.objetoHumor = new Triste();
        }
        else if (this.pontosDeFelicidade <= 15){
            this.objetoHumor = new Feliz();
        }
        else {
            this.objetoHumor = new MuitoFeliz();
        }
        return this.objetoHumor;
    }
    public void comer(Comida[] comidas){
        int pontoTotal = this.pontosDeFelicidade;
        for (Comida pontoComida : comidas) {
            pontoTotal = pontoTotal + pontoComida.getPontosDeFelicidade();
        }
        this.pontosDeFelicidade = pontoTotal;
    }
    @Override
    public String toString(){
        return this.pontosDeFelicidade+" "+obterHumorAtual().getClass().getSimpleName();
    }
}
