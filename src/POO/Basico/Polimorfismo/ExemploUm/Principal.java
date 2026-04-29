package POO.Basico.Polimorfismo.ExemploUm;

public class Principal {
    public static void main(String[] args) {
        //Rex é um animal mas não é um cachorro, ele se comporta como um cachorro
        Animal animalGenerico = new Animal();
        Animal rex = new Cachorro();
        Animal sushi = new Gato();

        animalGenerico.emitirSom();
        rex.emitirSom();
        sushi.emitirSom();
    }
}