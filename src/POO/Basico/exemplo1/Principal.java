package POO.Basico.exemplo1;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Marco";
        pessoa1.idade = 29;
        pessoa1.peso = 82;

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Fernando";
        pessoa2.idade = 25;
        pessoa2.peso = 80;

        Carro carro1 = new Carro();
        carro1.ano = 1994;
        carro1.cor = "vermelho";
        carro1.marca = "Mazda";
        carro1.modelo = "Miata MX-5";
        carro1.dono = pessoa2;

        carro1.ligar();
    }
}
