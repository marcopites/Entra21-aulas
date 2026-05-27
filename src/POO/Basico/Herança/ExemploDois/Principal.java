package POO.Basico.Herança.ExemploDois;

import org.w3c.dom.ls.LSOutput;

public class Principal {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Jean", 2.500, 3.000);
        System.out.println("O salário total de " + vendedor.getNome() + " é " + vendedor.getSalarioTotal());
    }

}
