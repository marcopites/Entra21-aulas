package POO.Basico.Abstracao.ExercicioDezessete;

public class Cliente extends UsuarioSistema {

    public Cliente(String login) {
        super(login);
    }

    @Override
    public void exibirPermissoes() {
        System.out.println("Usuário: " + getLogin());
        System.out.println("Perfil: Cliente");
        System.out.println("Permissões: Ler e atualizar apenas os próprios dados.");
    }
}