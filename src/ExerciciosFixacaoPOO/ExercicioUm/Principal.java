package ExerciciosFixacaoPOO.ExercicioUm;

public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Marco Pites", 29);
        Pessoa p2 = new Pessoa("Carlos Silva", 21);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println(p1.getNome() + " é maior de idade? " + p1.ehMaiorDeIdade());
        System.out.println(p2.getNome() + " é maior de idade? " + p2.ehMaiorDeIdade());
    }

}
