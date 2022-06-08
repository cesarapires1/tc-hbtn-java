import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {
    private String numeracao;
    private double saldo;
    private double taxaJurosAnual;

    public ContaBancariaBasica(String numeraco, double taxaJurosAnual) {
        setNumeracao(numeraco);
        setTaxaJurosAnual(taxaJurosAnual);
        setSaldo(0);
    }

    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public void setNumeracao(String numeracao) {
        this.numeracao = numeracao;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTaxaJurosAnual(double taxaJurosAnual) {
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public void depositar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0) {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0\n");
        }
        setSaldo(getSaldo() + valor);
    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0) {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que 0\n");
        }
        if (valor > getSaldo()) {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual\n");
        }
        setSaldo(getSaldo() - valor);
    }

    public double calcularTarifaMensal() {
        double taxaSaldo = getSaldo()*0.1;
        if (taxaSaldo < 10) {
            return taxaSaldo;
        }
        return 10;
    }

    public double calcularJurosMensal() {
        if (getSaldo() <= 0) {
            return 0;
        }
        return getSaldo()*((getTaxaJurosAnual()/12)/100);
    }

    public void aplicarAtualizacaoMensal(){
        setSaldo(getSaldo()-calcularTarifaMensal()+calcularJurosMensal());
    }
}
