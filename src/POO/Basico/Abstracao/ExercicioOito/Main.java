package POO.Basico.Abstracao.ExercicioOito;

public class Main {
    public static void main(String[] args) {

        ContaBancaria corrente = new ContaCorrente("João", 1500.0);
        ContaBancaria poupanca = new ContaPoupanca("Ana", 3200.50);

        corrente.exibirTipoConta();
        System.out.println("---");
        poupanca.exibirTipoConta();
    }
}