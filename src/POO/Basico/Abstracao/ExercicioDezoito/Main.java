package POO.Basico.Abstracao.ExercicioDezoito;

public class Main {
    public static void main(String[] args) {

        Tarefa simples = new TarefaSimples("Organizar arquivos do projeto");
        Tarefa urgente = new TarefaUrgente("Corrigir bug em produção", "Carlos");

        simples.concluir();
        System.out.println("---");
        urgente.concluir();
    }
}