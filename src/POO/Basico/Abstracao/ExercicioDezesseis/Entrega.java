package POO.Basico.Abstracao.ExercicioDezesseis;

public class Entrega extends Servico {

    private String endereco;

    public Entrega(String descricao, String endereco) {
        super(descricao);
        this.endereco = endereco;
    }

    @Override
    public void executar() {
        System.out.println("Executando serviço de entrega: " + getDescricao());
        System.out.println("Endereço: " + endereco);
    }
}