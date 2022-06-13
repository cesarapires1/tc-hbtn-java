import java.util.*;
import java.util.stream.Collectors;

public class Consulta {
    public static List<Produto> obterLivrosDoPedido(Pedido pedido) {
        List<Produto> produtosPedido = pedido.getProdutos();

        List<Produto> pedidoFiltrado = produtosPedido
                .stream()
                .filter(produto -> produto.getCategoria().equals(CategoriaProduto.LIVRO))
                .collect(Collectors.toList());

        return pedidoFiltrado;
    }
}
