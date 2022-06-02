import java.util.*;

public class NumerosDuplicados {
    public static TreeSet<Integer> buscar(int[] ints) {
        HashSet<Integer> verificador = new HashSet<>();
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
                    verificador.add(numeroPrincipal);
                }
        }

        verificadorNumeros.addAll(verificador);

        return verificadorNumeros;
    }
}
