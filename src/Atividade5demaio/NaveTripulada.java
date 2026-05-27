
public class NaveTripulada extends NaveEspacial {

    private int numeroDeSuporte; // Sistemas de suporte à vida

    public NaveTripulada(int id, String nome, int capacidade, int numeroDeSuporte) {
        super(id, nome, "Tripulada", capacidade); // chama o construtor da classe pai
        this.numeroDeSuporte = numeroDeSuporte;
    }

    public int getNumeroDeSuporte() { return numeroDeSuporte; }
    public void setNumeroDeSuporte(int numeroDeSuporte) { this.numeroDeSuporte = numeroDeSuporte; }

    @Override
    public String carregar() {
        return "Embarcando " + getCapacidade() + " astronautas com "
                + numeroDeSuporte + " sistemas de suporte à vida.";
    }

    @Override
    public String toString() {
        return super.toString() + " | Sistemas de Suporte: " + numeroDeSuporte;
    }
}