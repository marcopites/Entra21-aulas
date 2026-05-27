
public class MissaoResgate extends Missao {

    private String alvoDoResgate;

    public MissaoResgate(int id, String nome, String objetivo,
                         String dataLancamento, String alvoDoResgate) {
        super(id, nome, objetivo, dataLancamento);
        this.alvoDoResgate = alvoDoResgate;
    }

    public String getAlvoDoResgate() { return alvoDoResgate; }
    public void setAlvoDoResgate(String alvo) { this.alvoDoResgate = alvo; }


    @Override
    public String descreverOperacao() {
        return "Resgate e recuperação de: " + alvoDoResgate + ".";
    }
}