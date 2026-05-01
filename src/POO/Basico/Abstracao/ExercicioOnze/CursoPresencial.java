package POO.Basico.Abstracao.ExercicioOnze;

public class CursoPresencial extends Curso {

    private String localidade;

    public CursoPresencial(String nome, int cargaHoraria, String localidade) {
        super(nome, cargaHoraria);
        this.localidade = localidade;
    }

    @Override
    public void exibirFormato() {
        System.out.println("Curso Presencial: " + getNome());
        System.out.println("Carga Horária: " + getCargaHoraria() + "h");
        System.out.println("Local: " + localidade);
    }
}