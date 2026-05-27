package POO.Basico.Abstracao.ExercicioDezessete;

public class Main {
    public static void main(String[] args) {

        UsuarioSistema admin = new Administrador("admin.root");
        UsuarioSistema cliente = new Cliente("marco.pites");

        admin.exibirPermissoes();
        System.out.println("---");
        cliente.exibirPermissoes();
    }
}