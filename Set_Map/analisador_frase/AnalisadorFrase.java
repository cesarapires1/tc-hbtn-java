
import java.util.*;

public class AnalisadorFrase {

    public static TreeMap contagemPalavras(String frase){
        List<String> listaFrase = new ArrayList<String>(Arrays.asList(frase.split(" ")));
        TreeMap<String, Integer> contadorPalavras = new TreeMap<String, Integer>();
//        contadorPalavras.putAll();
        for(String palavraCompleta : listaFrase){
            String palavraFinal = palavraCompleta.replaceAll("[\\s\\.\\?\\!]", "").toLowerCase();
            if (contadorPalavras.containsKey(palavraFinal)) {
                int quantidadePalavras = contadorPalavras.get(palavraFinal) + 1;
                contadorPalavras.put(palavraFinal, quantidadePalavras);
            } else {
                contadorPalavras.put(palavraFinal, 1);
            }
        }
        return contadorPalavras;
    }
}
