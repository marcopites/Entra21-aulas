package POO.Basico.Abstracao.ExercicioDezoito;

public class TarefaUrgente extends Tarefa {

    private String responsavel;

    public TarefaUrgente(String descricao, String responsavel) {
        super(descricao);
        this.responsavel = responsavel;
    }

    @Override
    public void concluir() {
        System.out.println("⚠ TAREFA URGENTE concluída: " + getDescricao());
        System.out.println("  Responsável: " + responsavel);
        System.out.println("  Notificando equipe...");
    }
}