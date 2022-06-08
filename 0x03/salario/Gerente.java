public class Gerente extends Empregado{

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    @Override
    public double calcularBonus(Departamento departamento) {
        if (departamento.alcancouMeta()) {

            double superavitMeta = departamento.getValorAtingidoMeta() - departamento.getValorMeta();
            double bonusMeta = superavitMeta*0.01;
            double bonusSalario = getSalarioFixo()*0.2;

            return bonusMeta+bonusSalario;
        }
        return 0;
    }
}
