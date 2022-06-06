import java.util.*;

public class Blog {
    ArrayList<Post> postagem = new ArrayList<Post>();

    public void adicionarPostagem(Post postagem) {
        this.postagem.add(postagem);
    }

    public Set<String> obterTodosAutores() {
        Set<String> autores = new TreeSet<>();
        for (Post post : postagem) {
            autores.add(post.getAutor());
        }
        return autores;
    }

    public Map<String, Integer> obterContagemPorCategoria() {
        Map<String, Integer> contagem = new TreeMap<>();
        for (Post post : postagem) {
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
