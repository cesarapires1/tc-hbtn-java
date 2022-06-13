import java.util.*;
import java.util.stream.Collectors;

public class Consulta {
    public static List<Produto> obterLivrosDoPedido(Pedido pedido) {
        List<Produto> pedidoFiltrado;
        List<Produto> produtosPedido = pedido.getProdutos();

        pedidoFiltrado = produtosPedido
                .stream()
                .filter(produto -> produto.getCategoria().equals(CategoriaProduto.LIVRO))
                .collect(Collectors.toList());

        return pedidoFiltrado;
    }

    public static Produto obterProdutoMaiorPreco(List<Produto> produtos) {
        Produto produtoMaioPreco;

        produtoMaioPreco = produtos
                .stream()
                .max(Comparator.comparing(produto -> produto.getPreco()))
                .get();

        return produtoMaioPreco;
    }

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, int precoMinimo) {
        List<Produto> pedidoFiltrado;

        pedidoFiltrado = produtos
                .stream()
                .filter(produto -> produto.getPreco() >= precoMinimo)
                .collect(Collectors.toList());

        return pedidoFiltrado;
    }
}
