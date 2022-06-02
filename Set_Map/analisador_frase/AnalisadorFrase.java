
import java.util.*;

public class AnalisadorFrase {

    public static TreeMap<String, Integer> contagemPalavras(String frase){
        ArrayList<String> listaFrase = new ArrayList<String>(Arrays.asList(frase.split(" ")));
        TreeMap<String, Integer> contadorPalavras = new TreeMap<String, Integer>();

        for(String palavraCompleta : listaFrase){
            String palavraFinal = palavraCompleta.replaceAll("[\\s\\.\\?\\!]", "").toLowerCase();
            if (contadorPalavras.containsKey(palavraFinal)) {
                Integer quantidadePalavras = contadorPalavras.get(palavraFinal) + 1;
                contadorPalavras.put(palavraFinal, quantidadePalavras);
            } else {
                contadorPalavras.put(palavraFinal, 1);
            }
        }

        return contadorPalavras;
    }
}
