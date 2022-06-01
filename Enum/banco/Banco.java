import java.util.*;

public class Banco {
    private String nome;
    private ArrayList<Agencia> agencias = new ArrayList<Agencia>();

    public Banco(String nome) {
        this.nome = nome;
    }

    public Agencia buscarAgencia(String nomeAgencia) {
        for (Agencia agencia : agencias) {
            if (agencia.getNome().equals(nomeAgencia)) {
                return agencia;
            }
        }
        return null;
    }

    public boolean adicionarAgencia(String nomeAgencia) {
        if (buscarAgencia(nomeAgencia) == null) {
            agencias.add(new Agencia(nomeAgencia));
        }
        return true;
    }

    public boolean adicionarCliente(String nomeAgencia, String nomeCliente, double valorTransacaoInicial) {
        Agencia agencia = buscarAgencia(nomeAgencia);
        if (agencia != null) {
            agencia.novoCliente(nomeCliente, valorTransacaoInicial);
            return true;
        }
        return false;
    }

    public boolean adicionarTransacaoCliente(String nomeAgencia, String nomeCliente, double valorTransacao) {
        Agencia agencia = buscarAgencia(nomeAgencia);
        if (agencia != null) {
            agencia.adicionarTransacaoCliente(nomeCliente, valorTransacao);
            return true;
        }
        return true;
    }

    public boolean listarClientes(String nomeAgencia, boolean imprimeTransacao){
        Agencia agencia = buscarAgencia(nomeAgencia);
        if (agencia != null) {
            ArrayList<Cliente> clientes = agencia.getClientes();
            int contatorCliente = 1;
            for (Cliente cliente : clientes) {
                System.out.println("Cliente: "+cliente.getNome()+" ["+contatorCliente+"]");
                if (imprimeTransacao) {
                    ArrayList<Double> transacoes = cliente.getTransacoes();
                    int contadorTransacoes = 1;
                    for (Double transacao : transacoes) {
                        System.out.println("  ["+contadorTransacoes+"] valor "+transacao);
                        contadorTransacoes++;
                    }
                }
                contatorCliente++;
            }
        }
        return true;
    }
}
