import Atividades.*;
import java.util.ArrayList;

public class Workflow {
    ArrayList<Atividade> atividades = new ArrayList<>();
    public void registrarAtividade(Atividade atividade){
        this.atividades.add(atividade);
    }

    public ArrayList<Atividade> getAtividades() {
        return atividades;
    }
}
