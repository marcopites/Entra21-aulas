package POO.Basico.Abstracao.ExercicioOnze;

public class CursoOnline extends Curso {

    private String plataforma;

    public CursoOnline(String nome, int cargaHoraria, String plataforma) {
        super(nome, cargaHoraria);
        this.plataforma = plataforma;
    }

    @Override
    public void exibirFormato() {
        System.out.println("Curso Online: " + getNome());
        System.out.println("Carga Horária: " + getCargaHoraria() + "h");
        System.out.println("Plataforma: " + plataforma);
    }
}