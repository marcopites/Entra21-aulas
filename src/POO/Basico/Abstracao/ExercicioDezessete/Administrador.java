package POO.Basico.Abstracao.ExercicioDezessete;

public class Administrador extends UsuarioSistema {

    public Administrador(String login) {
        super(login);
    }

    @Override
    public void exibirPermissoes() {
        System.out.println("Usuário: " + getLogin());
        System.out.println("Perfil: Administrador");
        System.out.println("Permissões: Criar, Ler, Atualizar e Deletar usuários e dados do sistema.");
    }
}