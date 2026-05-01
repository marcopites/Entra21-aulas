package POO.Basico.Abstracao.ExercicioDoze;

public class Main {
    public static void main(String[] args) {

        Midia musica = new Musica("Bohemian Rhapsody", "Queen");
        Midia video = new Video("Interestelar", 169);

        musica.reproduzir();
        System.out.println("---");
        video.reproduzir();
    }
}