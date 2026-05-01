package POO.Basico.Abstracao.ExercicioQuinze;

public class Main {
    public static void main(String[] args) {

        Ingresso comum = new IngressoComum(100.0);
        Ingresso vip = new IngressoVIP(100.0);

        System.out.println("=== Ingresso Comum ===");
        System.out.println("Valor base: R$ " + comum.getValor());
        System.out.println("Valor final (10% desconto): R$ " + comum.calcularValorFinal());

        System.out.println("---");

        System.out.println("=== Ingresso VIP ===");
        System.out.println("Valor base: R$ " + vip.getValor());
        System.out.println("Valor final (50% taxa): R$ " + vip.calcularValorFinal());
    }
}