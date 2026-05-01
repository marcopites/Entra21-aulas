package POO.Basico.Abstracao.ExercicioDezesseis;

public class Main {
    public static void main(String[] args) {

        Servico limpeza = new Limpeza("Limpeza residencial", "Sala e quartos");
        Servico entrega = new Entrega("Entrega de pacote", "Rua das Otto Anlauf Junior, 176 - Blumenau/SC");

        limpeza.executar();
        System.out.println("---");
        entrega.executar();
    }
}