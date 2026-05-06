
public class NaveCarga extends NaveEspacial {

    private double capacidadeToneladasKg;

    public NaveCarga(int id, String nome, int capacidadePassageiros, double capacidadeToneladasKg) {
        super(id, nome, "Carga", capacidadePassageiros);
        this.capacidadeToneladasKg = capacidadeToneladasKg;
    }

    public double getCapacidadeToneladasKg() { return capacidadeToneladasKg; }
    public void setCapacidadeToneladasKg(double t) { this.capacidadeToneladasKg = t; }


    @Override
    public String carregar() {
        return "Carregando " + capacidadeToneladasKg + " toneladas de suprimentos.";
    }

    @Override
    public String toString() {
        return super.toString() + " | Carga Máx.: " + capacidadeToneladasKg + " ton";
    }
}