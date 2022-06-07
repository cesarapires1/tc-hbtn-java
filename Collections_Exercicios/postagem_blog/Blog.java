import java.util.*;

public class Blog {
    private List<Post> postagem = new ArrayList<Post>();

    public void adicionarPostagem(Post postagem) {
        Set<Post> postagens = obterPostsPorAutor(postagem.getAutor());
        for (Post posts : postagens) {
            if (posts.getTitulo().equals(postagem.getTitulo())) {
                throw new IllegalArgumentException("Postagem jah existente");

            }
        }
        this.postagem.add(postagem);
    }

    public Set<Autor> obterTodosAutores() {
        Set<Autor> autores = new HashSet<>();
        for (Post post : postagem) {
            autores.add(post.getAutor());
        }
        return autores;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        Map<Categorias, Integer> contagem = new TreeMap<>();
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

    public Set<Post> obterPostsPorAutor(Autor autor) {
        Set<Post> postagemAutor = new HashSet<>();
        for (Post post : postagem) {
            if (post.getAutor().toString().equals(autor.toString())) {
                postagemAutor.add(post);
            }
        }
        return postagemAutor;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria) {
        Set<Post> postagemCategoria = new HashSet<>();
        for (Post post : postagem) {
            if (post.getCategoria().getDescricao().equals(categoria.getDescricao())) {
                postagemCategoria.add(post);
            }
        }
        return postagemCategoria;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        Map<Categorias, Set<Post>> postagemCategorias = new TreeMap<>();
        for (Post post : postagem) {
            Set<Post> postagemLista = new HashSet<>();
            if (postagemCategorias.containsKey(post.getCategoria())) {
                postagemLista = postagemCategorias.get(post.getCategoria());
            }
            postagemLista.add(post);
            postagemCategorias.put(post.getCategoria(), postagemLista);
        }
        return postagemCategorias;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor, Set<Post>> postagemAutores = new HashMap<>();
        for (Post post : postagem) {
            Set<Post> postagemLista = new HashSet<>();
            if (postagemAutores.containsKey(post.getAutor())) {
                postagemLista = postagemAutores.get(post.getAutor());
            }
            postagemLista.add(post);
            postagemAutores.put(post.getAutor(), postagemLista);
        }
        return postagemAutores;
    }
}
