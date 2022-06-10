import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ConsultaProdutos {
    static List<Produto> filtrar(List<Produto> produtos, Predicate<Produto> consultaProduto) {
        List<Produto> produtosNovoLista = new ArrayList<>();
        produtos.forEach(produto -> {
            if (consultaProduto.test(produto)) {
                produtosNovoLista.add(produto);
            }
        });
        return produtosNovoLista;
    }

}
