package POO.Basico.Abstracao.ExercicioNove;

public class Relatorio extends Documento {

    private String periodo;

    public Relatorio(String titulo, String periodo) {
        super(titulo);
        this.periodo = periodo;
    }

    @Override
    public String gerarResumo() {
        return "Relatório: " + getTitulo() + " | Período: " + periodo;
    }
}