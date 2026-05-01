package POO.Basico.Abstracao.ExercicioNove;

public class Contrato extends Documento {

    private String partes;

    public Contrato(String titulo, String partes) {
        super(titulo);
        this.partes = partes;
    }

    @Override
    public String gerarResumo() {
        return "Contrato: " + getTitulo() + " | Partes envolvidas: " + partes;
    }
}