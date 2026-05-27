package POO.Basico.Abstracao.ExemploDois;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        double valorDaCompra = sc.nextDouble();

        System.out.println("Escolha uma forma de pagamento: ");
        System.out.println("[1] - Pix");
        System.out.println("[2] - Boleto");
        int formaDePagamento = sc.nextInt();
        if (formaDePagamento == 1) {
            Pagamento pagamento = new Pix(valorDaCompra);
            pagamento.processar();
        } else if (formaDePagamento == 2) {
            Pagamento pagamento = new Boleto(valorDaCompra);
            pagamento.processar();
        } else {
            System.out.println("Escolha uma forma de pagamento válida!");
        }
    }
}
