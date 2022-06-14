import java.util.*;
import java.util.stream.*;

public class ConsultaPessoas {
    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> todasPessoas) {

        TreeMap<String, TreeSet<Pessoa>> listaPessoasCargo = todasPessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo, () -> new TreeMap<>(Comparator.reverseOrder()), Collectors.toCollection(TreeSet::new)));

        return listaPessoasCargo;

    }

    public static Map<String, Long> obterContagemPessoasPorCargo(List<Pessoa> todasPessoas) {
        Map<String, Long> listaContagemCargo;

        listaContagemCargo = todasPessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.counting()));

        return listaContagemCargo;
    }

    public static Map<String, Map<Integer, Long>> obterContagemPessoasPorCargoEIdade(List<Pessoa> todasPessoas) {
        Map<String,  Map<Integer, Long>> listaContagemCargo;

        listaContagemCargo = todasPessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.groupingBy(Pessoa::getIdade, Collectors.counting())));

        return listaContagemCargo;
    }
}
