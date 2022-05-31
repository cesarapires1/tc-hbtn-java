import java.util.ArrayList;

public class ListaTodo {
    private ArrayList <Tarefa> tarefas = new ArrayList<>();

    public ListaTodo() {}


    public void adicionarTarefa(Tarefa tarefa){
        if (verificarTarefa(tarefa)) {
            throw new IllegalArgumentException("Tarefa com identificador <identificador> ja existente na lista");
        }
        tarefas.add(tarefa);
    }

    public boolean marcarTarefaFeita(int identificador){
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getIdentificador() == identificador) {
                tarefa.setEstahFeita(true);
                return true;
            }
        }
        return false;
    }

    public boolean desfazerTarefa(int identificador){
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getIdentificador() == identificador) {
                tarefa.setEstahFeita(false);
                return true;
            }
        }
        return false;
    }

    private boolean verificarTarefa(Tarefa tarefa){
        for (Tarefa tarefaList : tarefas) {
            if (tarefaList.getIdentificador() == tarefa.getIdentificador()) {
                return true;
            }
        }
        return false;
    }

    public void fazerTodas(){
        for (Tarefa tarefa : tarefas) {
            tarefa.setEstahFeita(true);
        }
    }

    public void desfazerTodas(){
        for (Tarefa tarefa : tarefas) {
            tarefa.setEstahFeita(false);
        }
    }

    public void listarTarefas() {
        String isEstahFeita;
        for (Tarefa tarefa : tarefas) {
            isEstahFeita = " ";
            if (tarefa.isEstahFeita()) {
                isEstahFeita = "X";
            }
            System.out.println("["+isEstahFeita+"]  Id: "+tarefa.getIdentificador()+" - Descricao: "+tarefa.getDescricao());
        }
    }

}
