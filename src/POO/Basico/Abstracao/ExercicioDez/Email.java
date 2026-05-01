package POO.Basico.Abstracao.ExercicioDez;

public class Email extends Notificacao {

    private String destinatario;

    public Email(String mensagem, String destinatario) {
        super(mensagem);
        this.destinatario = destinatario;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando E-mail para: " + destinatario);
        System.out.println("Mensagem: " + getMensagem());
    }
}