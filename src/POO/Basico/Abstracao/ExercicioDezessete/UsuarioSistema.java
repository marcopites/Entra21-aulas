package POO.Basico.Abstracao.ExercicioDezessete;

public abstract class UsuarioSistema {

    private String login;

    public UsuarioSistema(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public abstract void exibirPermissoes();
}