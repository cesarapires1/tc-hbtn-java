import java.util.ArrayList;
import java.util.List;

public class ConsultaProdutos {
    static List<Produto> filtrar(List<Produto> produtos, CriterioFiltro consultaProduto) {
        List<Produto> produtosNovoLista = new ArrayList<>();
        produtos.forEach(produto -> {
            if (consultaProduto.testar(produto)) {
                produtosNovoLista.add(produto);
            }
        });
        return produtosNovoLista;
    }

}
