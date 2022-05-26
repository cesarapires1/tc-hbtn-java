public class Mensagem implements CanalNotificacao {
    protected String texto;
    protected TipoMensagem tipomensagem;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public TipoMensagem getTipomensagem() {
        return tipomensagem;
    }

    public void setTipomensagem(TipoMensagem tipomensagem) {
        this.tipomensagem = tipomensagem;
    }

    @Override
    public void notificar(Mensagem mensagem) {
        if (mensagem.getClass().getSimpleName() == "Email") {
            System.out.println("Email");
        } else if (mensagem.getClass().getSimpleName() == "SMS") {
            System.out.println("SMS");
        } else if (mensagem.getClass().getSimpleName() == "Slack") {
            System.out.println("Slack");
        } else if (mensagem.getClass().getSimpleName() == "Teams") {
            System.out.println("Teams");
        }
    }
}
