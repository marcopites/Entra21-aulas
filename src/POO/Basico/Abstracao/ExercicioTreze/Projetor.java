package POO.Basico.Abstracao.ExercicioTreze;

public class Projetor extends Equipamento {

    private int resolucao;

    public Projetor(String marca, int resolucao) {
        super(marca);
        this.resolucao = resolucao;
    }

    @Override
    public void ligar() {
        System.out.println("Projetor " + getMarca() + " ligando...");
        System.out.println("Resolução: " + resolucao + "p");
    }
}