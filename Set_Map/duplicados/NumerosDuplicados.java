import java.util.*;

public class NumerosDuplicados {
    public static TreeSet<Integer> buscar(int[] ints) {

        TreeSet<Integer> verificadorNumeros = new TreeSet<>();
        List<Integer> verificadorDuplicados = new ArrayList<Integer>();

        for (int numero : ints) {
            verificadorDuplicados.add(numero);
        }

        for (int numeroPrincipal : ints) {
                int ocorrencia = 0;

                for (int numeroSecundario : ints) {
                    if (numeroSecundario == numeroPrincipal) {
                        ocorrencia++;
                    }
                }

                if (ocorrencia >= 2) {
                    verificadorNumeros.add(numeroPrincipal);
                }
        }

        return verificadorNumeros;
    }
}
