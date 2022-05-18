public class PersonagemGame {
    private int saudeAtual;
    private String nome;
    private String status;

    public PersonagemGame(int saudeAtual, String nome) {
        setSaudeAtual(saudeAtual);
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = getNome();
        if(nome != "" && nome != null) {
            this.nome = nome;
        }

    }

    public String getStatus() {
        return status;
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.status = "vivo";
        if (saudeAtual == 0) {
            this.status = "morto";
        }
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
