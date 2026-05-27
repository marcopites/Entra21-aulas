public class Astronauta {

    private int id;
    private String nome;
    private String especialidade;

    // Construtor
    public Astronauta(int id, String nome, String especialidade) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
    }

    // Getters
    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getEspecialidade() { return especialidade; }

    // Setters
    public void setNome(String nome) { this.nome = nome; }
    public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }

    @Override
    public String toString() {
        return "ID: " + id + " | Nome: " + nome + " | Especialidade: " + especialidade;
    }
}