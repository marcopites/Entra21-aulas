package POO.Basico.Polimorfismo.ExemploTres;

public class Pix extends MetodoPagamento {

    @Override
    public void pagaAVista() {
        System.out.println("Pagando à vista com Pix");
    }
}
