package ExerciciosFixacaoPOO.ExercicioQuatro;

public class Principal {

    public static void main(String[] args) {

        Carro c1 = new Carro("Toyota", "Corolla", 2018, 200);
        Carro c2 = new Carro("Ford", "Mustang", 1969, 180);

        c1.exibirDados();
        c2.exibirDados();

    }
}
