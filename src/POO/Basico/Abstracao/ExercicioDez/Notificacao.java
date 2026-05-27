package POO.Basico.Abstracao.ExercicioDez;

public abstract class Notificacao {

    private String mensagem;

    public Notificacao(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    public abstract void enviar();
}