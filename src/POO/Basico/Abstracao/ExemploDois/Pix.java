package POO.Basico.Abstracao.ExemploDois;

public class Pix extends Pagamento {

    public Pix(double valor) {
        super(valor);
    }

    @Override
    public void processar() {
        System.out.println("Pagamento com PIX!");
    }
}
