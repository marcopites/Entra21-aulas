package POO.Basico.exemplo1;

public class Pessoa {

    public String nome;
    int idade;
    double peso;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;

    }

    public Pessoa() {

    }

    void apresentar() {
        System.out.println("Olá, meu nome é " + this.nome);
        System.out.println("Minha idade é " + this.idade);
        System.out.println("Meu peso é " + this.peso);
    }
}
