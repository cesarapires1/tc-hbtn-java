public class ContaBancariaControlada extends ContaBancariaBasica {
    private double saldoMinimo;
    private double valorPenaldiade;

    public ContaBancariaControlada(String numeraco, double taxaJurosAnual, double saldoMinimo, double valorPenaldiade) {
        super(numeraco, taxaJurosAnual);
        setSaldoMinimo(saldoMinimo);
        setValorPenaldiade(valorPenaldiade);
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    public double getValorPenaldiade() {
        return valorPenaldiade;
    }

    public void setValorPenaldiade(double valorPenaldiade) {
        this.valorPenaldiade = valorPenaldiade;
    }

    @Override
    public void aplicarAtualizacaoMensal() {
        if (getSaldo() <= getSaldoMinimo()) {
            setSaldo(getSaldo()-calcularTarifaMensal()+calcularJurosMensal()-getValorPenaldiade());
        } else {
            setSaldo(getSaldo()-calcularTarifaMensal()+calcularJurosMensal());
        }

    }
}
