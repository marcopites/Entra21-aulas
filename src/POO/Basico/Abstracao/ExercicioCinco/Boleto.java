package POO.Basico.Abstracao.ExercicioCinco;

public class Boleto extends Pagamento {

    public Boleto(double valor) {
        super(valor);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Boleto de R$ " + getValor() + " gerado! Vencimento em 3 dias úteis.");
    }
}