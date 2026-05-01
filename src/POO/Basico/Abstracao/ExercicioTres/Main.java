package POO.Basico.Abstracao.ExercicioTres;

public class Main {
    public static void main(String[] args) {

        Funcionario vendedor = new Vendedor("Carlos", 2000.0, 500.0);

        System.out.println("Funcionário: " + vendedor.getNome());
        System.out.println("Salário base: R$ " + vendedor.getSalarioBase());
        System.out.println("Salário total: R$ " + vendedor.calcularSalario());
    }
}