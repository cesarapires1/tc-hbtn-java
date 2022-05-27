package provedores;

public class JadLog implements ProvedorFrete {
    @Override
    public Frete calcularFrete(double peso, double valor) {
        double valorFrete;
        double percentagamFrete = 0.045f;
        if (peso > 2000) {
            percentagamFrete = 0.07f;
        }
        valorFrete = valor*percentagamFrete;
        Frete frete = new Frete(valorFrete, obterTipoProvedorFrete());
        return frete;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.JADLOG;
    }
}
