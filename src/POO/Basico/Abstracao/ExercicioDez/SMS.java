package POO.Basico.Abstracao.ExercicioDez;

public class SMS extends Notificacao {

    private String numero;

    public SMS(String mensagem, String numero) {
        super(mensagem);
        this.numero = numero;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando SMS para: " + numero);
        System.out.println("Mensagem: " + getMensagem());
    }
}