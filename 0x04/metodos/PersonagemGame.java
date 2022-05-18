public class PersonagemGame {
    private int saudeAtual;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
    }

    public void tomarDano(int quantidadeDeDano){
        int saudeAtual = this.saudeAtual - quantidadeDeDano;
        if(saudeAtual < 0){
            saudeAtual = 0;
        }
        setSaudeAtual(saudeAtual);
    }

    public void receberCura(int quantidadeDeCura){
        int saudeAtual = this.saudeAtual + quantidadeDeCura;
        if(saudeAtual > 100){
            saudeAtual = 100;
        }
        setSaudeAtual(saudeAtual);
    }
}
