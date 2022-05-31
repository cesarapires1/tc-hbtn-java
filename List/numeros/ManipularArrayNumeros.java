import java.util.*;

public class ManipularArrayNumeros {

    static public void adicionarNumero(List numeros, Integer i) throws Exception {
        if (buscarPosicaoNumero(numeros, i) == -1) {
            throw new Exception("Numero jah contido na lista");
        }
        numeros.add(i);
    }

    static public void removerNumero(List numeros, Integer i) throws Exception {
        if (buscarPosicaoNumero(numeros, i) != -1) {
            throw new Exception("Numero nao encontrado na lista");
        }
        numeros.remove(i);
    }

    static public void substituirNumero(List numeros, Integer numeroSubstituir, Integer numeroSubstituto){
        if (buscarPosicaoNumero(numeros, numeroSubstituir) == -1) {
            numeros.set(numeros.indexOf(numeroSubstituir), numeroSubstituto);
        } else {
            numeros.add(numeroSubstituto);
        }
    }

    static public int buscarPosicaoNumero(List numeros, Integer i){
        if (numeros.contains(i)) {
            return -1;
        }
        return 1;
    }
}