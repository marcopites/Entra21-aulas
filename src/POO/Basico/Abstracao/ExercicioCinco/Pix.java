package POO.Basico.Abstracao.ExercicioCinco;

public class Pix extends Pagamento {

    public Pix(double valor) {
        super(valor);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via PIX de R$ " + getValor() + " processado instantaneamente!");
    }
}