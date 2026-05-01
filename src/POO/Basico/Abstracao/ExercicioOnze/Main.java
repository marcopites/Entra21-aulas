package POO.Basico.Abstracao.ExercicioOnze;

public class Main {
    public static void main(String[] args) {

        Curso presencial = new CursoPresencial("Desenvolvimento de Software", 400, "Blumenau - SC");
        Curso online = new CursoOnline("Engenharia de Dados", 400, "Anhanguera");

        presencial.exibirFormato();
        System.out.println("---");
        online.exibirFormato();
    }
}