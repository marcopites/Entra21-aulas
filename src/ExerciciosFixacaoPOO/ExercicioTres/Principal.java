package ExerciciosFixacaoPOO.ExercicioTres;

public class Principal {
    public static void main(String[] args) {

        Cachorro c1 = new Cachorro("Toby", "Poodle", 3, 8.5);
        Cachorro c2 = new Cachorro("Betina", "Cheetos",2, 5);
        Cachorro c3 = new Cachorro("Kiara", "Cheetos", 7, 6);

        c1.exibirInformacoes();
        c2.exibirInformacoes();
        c3.exibirInformacoes();
    }
}
