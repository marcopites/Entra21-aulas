package POO.Basico.Abstracao.ExemploDois;

public abstract class Pagamento {
    private double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public double getValor(){
        return this.valor;
    }

    public abstract void processar();
}
