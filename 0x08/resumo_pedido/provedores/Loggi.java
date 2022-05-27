package provedores;

public class Loggi implements ProvedorFrete {
    @Override
    public Frete calcularFrete(double peso, double valor) {
        double valorFrete;
        double percentagamFrete = 0.04f;
        if (peso > 5000) {
            percentagamFrete = 0.12f;
        }
        valorFrete = valor*percentagamFrete;
        Frete frete = new Frete(valorFrete, obterTipoProvedorFrete());
        return frete;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.LOGGI;
    }
}
