import java.util.ArrayList;
import java.util.HashMap;

public class ListaTelefonica {
    HashMap<String, ArrayList<Telefone>> agenda;
    public void adicionarTelefone(String nomeAgenda, Telefone telefone) {
        //Se o nomeAgenda for nova
        ArrayList<Telefone> contatos;
        if (!agenda.containsKey(nomeAgenda)) {
            contatos = new ArrayList<Telefone>();
            contatos.add(telefone);
            agenda.put(nomeAgenda, contatos);
        } else {
            contatos = agenda.get(nomeAgenda);
            contatos.add(telefone);
            agenda.put(nomeAgenda, contatos);
        }
    }

    public ListaTelefonica() {
        agenda = new HashMap<String, ArrayList<Telefone>>();
    }

    public ArrayList<Telefone> buscar(String nomeAgenda) {
        if (agenda.containsKey(nomeAgenda)) {
            return agenda.get(nomeAgenda);
        }
        return null;
    }
}
