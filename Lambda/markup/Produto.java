import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {
    private String nome;
    private double preco;
    private double percentualMarkup = 10;

    Supplier<Double> precoComMarkup = () -> (Double) this.getPreco()*(1+this.percentualMarkup/100);
    Consumer<Double> atualizarMarkup = (novoValor) -> setPercentualMarkup(novoValor);


    public Produto(double preco, String nome) {
        this.nome = nome;
        this.preco = preco;
        this.percentualMarkup = 10;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }


    public void setPercentualMarkup(double percentualMarkup) {
        this.percentualMarkup = percentualMarkup;
    }


}
