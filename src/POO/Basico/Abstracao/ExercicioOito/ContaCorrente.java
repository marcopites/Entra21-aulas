package POO.Basico.Abstracao.ExercicioOito;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void exibirTipoConta() {
        System.out.println("Conta Corrente");
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo: R$ " + getSaldo());
    }
}