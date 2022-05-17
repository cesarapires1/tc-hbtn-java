public class InteiroPositivo {
    private int valor;
    private int cont;

    public InteiroPositivo(int valor) throws Exception {
        if (valor < 0) {
            throw new Exception("Valor nao eh um valor inteiro positivo");
        }
        this.valor = valor;
    }
    public InteiroPositivo(String valor) throws Exception {
        Integer valor_int = new Integer(valor);
        if (valor_int < 0) {
            throw new Exception("Valor nao eh um valor inteiro positivo");
        }
        this.valor = valor_int;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) throws Exception{
        if (valor < 0) {
            throw new Exception("Valor nao eh um valor inteiro positivo");
        }
        this.valor = valor;
    }

    public boolean ehPrimo() {
        if(valor == 1){
            return false;
        }
        for (cont = 2; cont < valor-1; cont++) {
            if (valor%cont == 0) {
                return false;
            }
        }
        return true;
    }
}