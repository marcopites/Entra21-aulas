import java.util.ArrayList;
import java.util.List;


public abstract class Missao implements Gerenciavel {

    private int id;
    private String nome;
    private String objetivo;
    private String dataLancamento;
    private String status;

    private NaveEspacial nave;
    private List<Astronauta> astronautas;

    public Missao(int id, String nome, String objetivo, String dataLancamento) {
        this.id = id;
        this.nome = nome;
        this.objetivo = objetivo;
        this.dataLancamento = dataLancamento;
        this.status = "Planejada";
        this.astronautas = new ArrayList<>();
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getObjetivo() { return objetivo; }
    public String getDataLancamento() { return dataLancamento; }
    public NaveEspacial getNave() { return nave; }
    public List<Astronauta> getAstronautas() { return astronautas; }

    public void setNome(String nome) { this.nome = nome; }
    public void setObjetivo(String objetivo) { this.objetivo = objetivo; }
    public void setDataLancamento(String data) { this.dataLancamento = data; }

    public void setNave(NaveEspacial nave) {
        this.nave = nave;
    }

    public void adicionarAstronauta(Astronauta astronauta) {
        this.astronautas.add(astronauta);
    }

    @Override
    public void iniciar() {
        this.status = "Em Andamento";
        System.out.println("Missão '" + nome + "' iniciada!");
    }

    @Override
    public void pausar() {
        this.status = "Pausada";
        System.out.println("Missão '" + nome + "' pausada.");
    }

    @Override
    public void finalizar() {
        this.status = "Concluída";
        System.out.println("Missão '" + nome + "' concluída!");
    }

    @Override
    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }

    public abstract String descreverOperacao();

    @Override
    public String toString() {
        String nomeNave = (nave != null) ? nave.getNome() : "Nenhuma";
        StringBuilder nomeAstronautas = new StringBuilder();
        if (astronautas.isEmpty()) {
            nomeAstronautas.append("Nenhum");
        } else {
            for (int i = 0; i < astronautas.size(); i++) {
                nomeAstronautas.append(astronautas.get(i).getNome());
                if (i < astronautas.size() - 1) nomeAstronautas.append(", ");
            }
        }
        return "ID: " + id + " | Nome: " + nome + " | Objetivo: " + objetivo
                + " | Data: " + dataLancamento + " | Status: " + status
                + " | Nave: " + nomeNave + " | Astronautas: " + nomeAstronautas
                + "\n  >> Operação: " + descreverOperacao();
    }
}