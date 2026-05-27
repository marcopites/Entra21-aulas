package POO.Basico.Abstracao.ExercicioDez;

public class Main {
    public static void main(String[] args) {

        Notificacao email = new Email("Sua fatura está disponível!", "marco@email.com");
        Notificacao sms = new SMS("Seu código de verificação é 4821.", "+55 47 99999-0000");

        email.enviar();
        System.out.println("---");
        sms.enviar();
    }
}