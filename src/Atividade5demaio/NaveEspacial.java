public abstract class NaveEspacial {

    private int id;
    private String nome;
    private String tipo;
    private int capacidade;

    public NaveEspacial(int id, String nome, String tipo, int capacidade) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.capacidade = capacidade;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getTipo() { return tipo; }
    public int getCapacidade() { return capacidade; }

    public void setNome(String nome) { this.nome = nome; }
    public void setCapacidade(int capacidade) { this.capacidade = capacidade; }

    public abstract String carregar();

    @Override
    public String toString() {
        return "ID: " + id + " | Nome: " + nome + " | Tipo: " + tipo
                + " | Capacidade: " + capacidade + " | Função: " + carregar();
    }
}