package POO.Basico.Polimorfismo.ExemploTres;

public class CartaoCredito extends MetodoPagamento {

    @Override
    public void pagaAVista() {
        System.out.println("Pagando com cartão de Crédito");
    }
}
