public class InteiroPositivo {
    private int valor;
    int cont;

    public InteiroPositivo(int valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
        this.valor = valor;
    }
    public InteiroPositivo(String valor) {
        int valor_int = Integer.parseInt(valor);
        if (valor_int < 0) {
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
        this.valor = valor_int;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
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
