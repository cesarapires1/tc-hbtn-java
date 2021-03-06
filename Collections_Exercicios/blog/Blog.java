import java.util.*;

public class Blog {
    private List<Post> postagens;

    public Blog(){
        this.postagens = new ArrayList<Post>();
    }

    public void adicionarPostagem(Post postagem) {
        this.postagens.add(postagem);
    }

    public Set<String> obterTodosAutores() {
        Set<String> autores = new TreeSet<>();
        for (Post post : postagens) {
            autores.add(post.getAutor());
        }
        return autores;
    }

    public Map<String, Integer> obterContagemPorCategoria() {
        Map<String, Integer> contagem = new TreeMap<>();
        for (Post post : postagens) {
            int contagemAtual = 1;
            if (contagem.containsKey(post.getCategoria())) {
                contagemAtual = contagem.get(post.getCategoria());
                contagemAtual++;
            }
            contagem.put(post.getCategoria(), contagemAtual);
        }
        return contagem;
    }
}
