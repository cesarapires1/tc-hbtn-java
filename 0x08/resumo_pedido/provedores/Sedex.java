package provedores;

public class Sedex implements  ProvedorFrete {
    @Override
    public Frete calcularFrete(double peso, double valor) {
        double valorFrete;
        double percentagamFrete = 0.05f;
        if (peso > 1000) {
            percentagamFrete = 0.1f;
        }
        valorFrete = valor*percentagamFrete;
        Frete frete = new Frete(valorFrete, obterTipoProvedorFrete());
        return frete;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.SEDEX;
    }
}
