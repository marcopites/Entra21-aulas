package POO.Basico.Polimorfismo.ExemploTres;

public class Carrinho {
   private double valorCompra;

   public Carrinho(double valorCompra) {
       this.valorCompra = valorCompra;
   }

   public void realizarCompra(MetodoPagamento metodoPagamento) {
       metodoPagamento.pagaAVista();
       System.out.println("Compra realizada com sucesso!");
   }
}
