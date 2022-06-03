import java.util.*;

public class Biblioteca <T>{

    List<T> biblioteca = new ArrayList<>();

    public void adicionarMidia(T midiaNova) {
        this.biblioteca.add(midiaNova);
    }

    public List<T> obterListaMidias() {
        return biblioteca;
    }
}
