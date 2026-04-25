package POO.Basico.Encapsulamento.ExemploUm;

public class Pessoa {
    private String nome;

    public void setNome(String nome) {
        if (nome == null || nome.length() == 0) {
            System.out.println(("Não Existe nome nulo!!"));
        } else {
            this.nome = nome;
        }
    }
    public String getnome() {
        return this.nome;
    }

    public void apresentar() {
        System.out.println("Meu nome é " + this.nome);
        System.out.println("Meu nome tem " + this.nome.length() + "letras");
    }
}
