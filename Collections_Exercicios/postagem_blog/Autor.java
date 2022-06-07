public class Autor implements Comparable<Autor>{
    private String nome;
    private String sobrenome;

    public Autor(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return this.nome + ' '+ this.sobrenome;
    }

    public int hashCode() {
        int hash = 5 + toString().hashCode();
        return hash;
    }

    public int compareTo(Autor autor) {
        return this.toString().compareTo(autor.toString());
    }

}
