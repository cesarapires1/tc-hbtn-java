public class ContaBancariaControlada extends ContaBancariaBasica {
    private double saldoMinimo;
    private double valorPenalidade;

    public ContaBancariaControlada(String numeraco, double taxaJurosAnual, double saldoMinimo, double valorPenalidade) {
        super(numeraco, taxaJurosAnual);
        setSaldoMinimo(saldoMinimo);
        setvalorPenalidade(valorPenalidade);
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    public double getvalorPenalidade() {
        return valorPenalidade;
    }

    public void setvalorPenalidade(double valorPenalidade) {
        this.valorPenalidade = valorPenalidade;
    }

    @Override
    public void aplicarAtualizacaoMensal() {
        if (getSaldo() <= getSaldoMinimo()) {
            setSaldo(getSaldo()-calcularTarifaMensal()+calcularJurosMensal()-getvalorPenalidade());
        } else {
            setSaldo(getSaldo()-calcularTarifaMensal()+calcularJurosMensal());
        }

    }
}
