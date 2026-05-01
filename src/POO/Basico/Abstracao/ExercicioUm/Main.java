package POO.Basico.Abstracao.Exercicios;

//Crie uma classe abstrata chamada Animal com o atributo nome
// e o método abstrato emitirSom() . Depois, crie as classes Cachorro
// e e implemente o método Gato , ambas herdando de Animal e implemente o
//  metodo emitirSom() de forma diferente em cada uma.

public class Main {
    public static void main(String[] args) {

        Animal cachorro = new Cachorro("Betina");
        Animal gato = new Gato("Missi");

        cachorro.emitirSom();
        gato.emitirSom();
    }
}