package POO.Basico.Polimorfismo.ExemploUm;

public class Gato extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("Miau miau!");
    }
}