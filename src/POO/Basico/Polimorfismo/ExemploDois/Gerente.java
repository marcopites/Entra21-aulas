package POO.Basico.Polimorfismo.ExemploDois;

public class Gerente extends Funcionario {

    @Override
    public double calcularPagamento() {
        return super.getSalarioBase() + 1000;
    }
}
