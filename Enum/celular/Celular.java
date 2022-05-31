import java.util.ArrayList;

public class Celular {
    private ArrayList<Contato> contatos = new ArrayList<Contato>();

    public void adicionarContato(Contato contatoNovo){
        if (obterPosicaoContato(contatoNovo.getNome()) > -1) {
            throw new IllegalArgumentException("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
        }
        contatos.add(contatoNovo);
    }

    public void atualizarContato(Contato contatoAntigo, Contato novoContato) throws Exception {
        int indexContato = obterPosicaoContato(novoContato.getNome());
        if (obterPosicaoContato(contatoAntigo.getNome()) == -1) {
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");
        } else if (indexContato != -1 && indexContato != obterPosicaoContato(contatoAntigo.getNome()) ) {
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente com esse nome");
        }
        contatos.set(indexContato, novoContato);
    }

    public void removerContato(Contato contato) {
        int indexContato = obterPosicaoContato(contato.getNome());
        if (indexContato == -1) {
            throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
        }
        contatos.remove(indexContato);
    }

    public int obterPosicaoContato(String contatoNome) {
        int contatoIndex = 0;
        for (Contato contato : contatos) {
            if (contato.getNome().equals(contatoNome)) {
                return contatoIndex;
            }
            contatoIndex++;
        }
        return -1;
    }

    public void listarContatos(){
        for (Contato contato : contatos) {
            System.out.println(contato.getNome()+" -> "+contato.getNumeroTelefone()+" ("+contato.getTipo().getDescricao()+")");
        }
    }
}
