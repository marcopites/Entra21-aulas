package POO.Basico.Abstracao.ExercicioDezoito;

public class TarefaSimples extends Tarefa {

    public TarefaSimples(String descricao) {
        super(descricao);
    }

    @Override
    public void concluir() {
        System.out.println("Tarefa simples concluída: " + getDescricao());
    }
}