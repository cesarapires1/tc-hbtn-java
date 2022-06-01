import java.util.*;

public class Cliente {
    private String nome;
    private ArrayList<Double> transacoes = new ArrayList<Double>();

    public Cliente(String nome, double transacoes) {
        this.nome = nome;
        adicionarTransacao(transacoes);
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Double> getTransacoes() {
        return transacoes;
    }

    public void adicionarTransacao(double valorTransacao) {
        transacoes.add(valorTransacao);
    }
}
