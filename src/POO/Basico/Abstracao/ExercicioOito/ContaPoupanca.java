package POO.Basico.Abstracao.ExercicioOito;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void exibirTipoConta() {
        System.out.println("Conta Poupança");
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo: R$ " + getSaldo());
    }
}