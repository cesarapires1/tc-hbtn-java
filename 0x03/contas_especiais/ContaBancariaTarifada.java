import exceptions.OperacaoInvalidaException;

public class ContaBancariaTarifada extends ContaBancariaBasica {
    private int quantidadeTransacoes;

    public ContaBancariaTarifada(String numeraco, double taxaJurosAnual) {
        super(numeraco, taxaJurosAnual);
    }

    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes;
    }

    public void setQuantidadeTransacoes(int quantidadeTransacoes) {
        this.quantidadeTransacoes = quantidadeTransacoes;
    }

    @Override
    public void depositar(double valor) throws OperacaoInvalidaException {
        setQuantidadeTransacoes(getQuantidadeTransacoes() + 1);
        setSaldo(getSaldo() - 0.1);
        super.depositar(valor);
    }

    @Override
    public void sacar(double valor) throws OperacaoInvalidaException {
        setQuantidadeTransacoes(getQuantidadeTransacoes() + 1);
        setSaldo(getSaldo() - 0.1);
        super.sacar(valor);
    }

}
