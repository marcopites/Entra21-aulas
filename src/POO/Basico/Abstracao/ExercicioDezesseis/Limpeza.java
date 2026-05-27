package POO.Basico.Abstracao.ExercicioDezesseis;

public class Limpeza extends Servico {

    private String area;

    public Limpeza(String descricao, String area) {
        super(descricao);
        this.area = area;
    }

    @Override
    public void executar() {
        System.out.println("Executando serviço de limpeza: " + getDescricao());
        System.out.println("Área: " + area);
    }
}