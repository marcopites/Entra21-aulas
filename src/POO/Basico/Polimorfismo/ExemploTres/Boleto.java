package POO.Basico.Polimorfismo.ExemploTres;

public class Boleto extends MetodoPagamento {

    @Override
    public void pagaAVista() {
        System.out.println("Pagando com boleto");
    }
}