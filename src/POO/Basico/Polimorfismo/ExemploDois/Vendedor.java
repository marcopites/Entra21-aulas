package POO.Basico.Polimorfismo.ExemploDois;

public class Vendedor extends Funcionario {

    private double comissao; // declaração do campo

    public Vendedor(double salarioBase, double comissao) {
        super.setSalarioBase(salarioBase);
        this.comissao = comissao; // atribuição correta
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularPagamento() {
        return super.getSalarioBase() + this.comissao;
    }
}