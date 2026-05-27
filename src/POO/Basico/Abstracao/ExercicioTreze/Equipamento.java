package POO.Basico.Abstracao.ExercicioTreze;

public abstract class Equipamento {

    private String marca;

    public Equipamento(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public abstract void ligar();
}