import java.util.*;

public class Biblioteca <T extends Midia>{

    List<Midia> biblioteca = new ArrayList<>();

    public void adicionarMidia(Midia midiaNova) {
        this.biblioteca.add(midiaNova);
    }

    public List<Midia> obterListaMidias() {
        return biblioteca;
    }
}
