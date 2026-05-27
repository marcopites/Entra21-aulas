package POO.Basico.Abstracao.ExercicioTreze;

public class Computador extends Equipamento {

    private String sistemaOperacional;

    public Computador(String marca, String sistemaOperacional) {
        super(marca);
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override
    public void ligar() {
        System.out.println("Computador " + getMarca() + " ligando...");
        System.out.println("Iniciando sistema operacional: " + sistemaOperacional);
    }
}