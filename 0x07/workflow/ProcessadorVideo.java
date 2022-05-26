import java.util.ArrayList;

public class ProcessadorVideo {
    ArrayList<CanalNotificacao> canais = new ArrayList<CanalNotificacao>();
    public void registrarCanal(CanalNotificacao canais) {
        this.canais.add(canais);
    }

    public void processar(Video video) {
        for (CanalNotificacao canal: this.canais) {
            System.out.print("["+canal.getClass().getName()+"] {LOG} - "+video.getArquivo()+" - "+video.getFormato()+"\n");
        }

    }
}
