import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Pedido {
    private int codigo;
    private List<Produto> produtos = new ArrayList<>();
    private Cliente cliente;

    public Pedido(int codigo, List<Produto> produtos, Cliente cliente) {
        this.codigo = codigo;
        this.produtos = produtos;
        this.cliente = cliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        String string = String.format("[%d] %s", getCodigo(), getCliente().getNome());
        return string;
    }
}
