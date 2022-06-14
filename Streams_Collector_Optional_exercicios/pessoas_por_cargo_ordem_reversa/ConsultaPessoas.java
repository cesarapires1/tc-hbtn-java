import java.util.*;
import java.util.stream.*;

public class ConsultaPessoas {
    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> todasPessoas) {

        TreeMap<String, TreeSet<Pessoa>> listaPessoasCargo = todasPessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo, () -> new TreeMap<>(Comparator.reverseOrder()), Collectors.toCollection(TreeSet::new)));

        return listaPessoasCargo;

    }
}
