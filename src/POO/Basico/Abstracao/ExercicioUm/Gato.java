package POO.Basico.Abstracao.Exercicios;

public class Gato extends Animal {

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz: Miau!");
    }
}