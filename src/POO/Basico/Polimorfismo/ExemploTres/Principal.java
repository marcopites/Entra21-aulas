package POO.Basico.Polimorfismo.ExemploTres;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        System.out.println("Bem-vindo!");
        System.out.println("Digite o valor da sua compra");
        Scanner scanner = new Scanner(System.in);
        double valorDacompra = scanner.nextDouble();

        System.out.println("Escolha a forma de pagamento");
        System.out.println("(1) - PIX");
        System.out.println("(2) - Boleto");
        System.out.println("(3) - Cartão de Crédito");


        Carrinho carrinho = new Carrinho(valorDacompra);
        int formaDePagamento = scanner.nextInt();

        switch (formaDePagamento) {
            case 1: {
                carrinho.realizarCompra(new Pix());
                break;
            }
            case 2: {
                carrinho.realizarCompra(new Boleto());
                break;
            }
            case 3: {
                carrinho.realizarCompra(new CartaoCredito());
                break;
            }
            default: {
                throw new IllegalArgumentException("Forma de pagamento inválida");
            }
        }

    }
}
