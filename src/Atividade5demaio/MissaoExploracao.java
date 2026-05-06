public class MissaoExploracao extends Missao {

    private String planetaAlvo;

    public MissaoExploracao(int id, String nome, String objetivo,
                            String dataLancamento, String planetaAlvo) {
        super(id, nome, objetivo, dataLancamento);
        this.planetaAlvo = planetaAlvo;
    }

    public String getPlanetaAlvo() { return planetaAlvo; }
    public void setPlanetaAlvo(String planetaAlvo) { this.planetaAlvo = planetaAlvo; }


    @Override
    public String descreverOperacao() {
        return "Exploração científica do planeta " + planetaAlvo + ".";
    }
}