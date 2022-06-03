import java.util.*;

public class ListaTelefonica {
    HashMap<String, HashSet<Telefone>> agenda;
    public void adicionarTelefone(String nomeAgenda, Telefone telefone) {
        HashSet<Telefone> contatos;

        for (String listaContato : agenda.keySet()) {
            if (nomeAgenda == listaContato) {
                HashSet<Telefone> listaTelefone = buscar(listaContato);
                for (Telefone contato : listaTelefone) {
                    if (contato.equals(telefone)) {
                        throw new IllegalArgumentException("Telefone jah existente para essa pessoa");
                    }
                }
            } else {
                HashSet<Telefone> listaTelefone = buscar(listaContato);
                for (Telefone contato : listaTelefone) {
                    if (contato.equals(telefone)) {
                        throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");
                    }
                }
            }
        }

        //Se o nomeAgenda for nova
        if (!agenda.containsKey(nomeAgenda)) {
            contatos = new HashSet<Telefone>();
        } else {
            contatos = agenda.get(nomeAgenda);
        }

        if (contatos.equals(telefone)) {
            throw new IllegalArgumentException("Telefone jah existente para essa pessoa");
        }

        contatos.add(telefone);
        agenda.put(nomeAgenda, contatos);
    }

    public ListaTelefonica() {
        agenda = new HashMap<String, HashSet<Telefone>>();
    }

    public HashSet<Telefone> buscar(String nomeAgenda) {
        if (agenda.containsKey(nomeAgenda)) {
            return agenda.get(nomeAgenda);
        }
        return null;
    }
}
