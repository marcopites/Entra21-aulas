package POO.Basico.Abstracao.ExercicioCinco;

public class Main {
    public static void main(String[] args) {

        Pagamento pix = new Pix(150.0);
        Pagamento boleto = new Boleto(320.50);

        pix.processarPagamento();
        boleto.processarPagamento();
    }
}