package POO.Basico.Abstracao.ExercicioNove;

public class Main {
    public static void main(String[] args) {

        Documento contrato = new Contrato("Contrato de Prestação de Serviços", "Empresa Senior e Empresa Senac");
        Documento relatorio = new Relatorio("Relatório Mensal de Vendas", "Abril/2026");

        System.out.println(contrato.gerarResumo());
        System.out.println(relatorio.gerarResumo());
    }
}