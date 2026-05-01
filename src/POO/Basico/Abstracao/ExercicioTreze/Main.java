package POO.Basico.Abstracao.ExercicioTreze;

public class Main {
    public static void main(String[] args) {

        Equipamento computador = new Computador("Acer", "Windows 11");
        Equipamento projetor = new Projetor("Epson", 1080);

        computador.ligar();
        System.out.println("---");
        projetor.ligar();
    }
}