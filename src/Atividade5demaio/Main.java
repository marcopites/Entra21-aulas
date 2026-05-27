import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Missao> missoes = new ArrayList<>();
    private static List<NaveEspacial> naves = new ArrayList<>();
    private static List<Astronauta> astronautas = new ArrayList<>();

    private static int proximoIdMissao = 1;
    private static int proximoIdNave = 1;
    private static int proximoIdAstronauta = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        missoes.add(new MissaoExploracao(proximoIdMissao++, "Missão Marte",
                "Explorar a superfície de Marte", "2025-01-15", "Marte"));
        naves.add(new NaveTripulada(proximoIdNave++, "Discovery One", 5, 3));
        naves.add(new NaveCarga(proximoIdNave++, "Cargo Titan", 2, 50.0));
        astronautas.add(new Astronauta(proximoIdAstronauta++, "Neil Armstrong", "Comandante"));
        astronautas.add(new Astronauta(proximoIdAstronauta++, "Buzz Aldrin", "Piloto"));

        int opcao;
        do {
            System.out.println("\n--- Sistema de Gerenciamento de Exploração Espacial ---");
            System.out.println("1.  Adicionar Missão de Exploração");
            System.out.println("2.  Adicionar Missão de Resgate");
            System.out.println("3.  Adicionar Nave Tripulada");
            System.out.println("4.  Adicionar Nave de Carga");
            System.out.println("5.  Adicionar Astronauta");
            System.out.println("6.  Listar Missões");
            System.out.println("7.  Listar Naves");
            System.out.println("8.  Listar Astronautas");
            System.out.println("9.  Associar Nave a Missão");
            System.out.println("10. Associar Astronauta a Missão");
            System.out.println("11. Atualizar Status da Missão");
            System.out.println("12. Remover Missão");
            System.out.println("13. Buscar Missões por Status");
            System.out.println("14. Relatório de Missões Concluídas");
            System.out.println("0.  Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número.");
                opcao = -1;
                continue;
            }

            switch (opcao) {
                case 1 -> adicionarMissaoExploracao(scanner);
                case 2 -> adicionarMissaoResgate(scanner);
                case 3 -> adicionarNaveTripulada(scanner);
                case 4 -> adicionarNaveCarga(scanner);
                case 5 -> adicionarAstronauta(scanner);
                case 6 -> listarMissoes();
                case 7 -> listarNaves();
                case 8 -> listarAstronautas();
                case 9 -> associarNaveAMissao(scanner);
                case 10 -> associarAstronautaAMissao(scanner);
                case 11 -> atualizarStatusMissao(scanner);
                case 12 -> removerMissao(scanner);
                case 13 -> buscarMissoesPorStatus(scanner);
                case 14 -> relatorioMissoesConcluidas();
                case 0 -> System.out.println("Saindo do sistema. Até logo!");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }


    private static void adicionarMissaoExploracao(Scanner scanner) {
        try {
            System.out.print("Nome da Missão: ");
            String nome = scanner.nextLine();
            System.out.print("Objetivo: ");
            String objetivo = scanner.nextLine();
            System.out.print("Data de Lançamento (AAAA-MM-DD): ");
            String data = scanner.nextLine();
            System.out.print("Planeta Alvo: ");
            String planeta = scanner.nextLine();
            missoes.add(new MissaoExploracao(proximoIdMissao++, nome, objetivo, data, planeta));
            System.out.println("Missão de exploração '" + nome + "' adicionada com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao adicionar missão: " + e.getMessage());
        }
    }

    private static void adicionarMissaoResgate(Scanner scanner) {
        try {
            System.out.print("Nome da Missão: ");
            String nome = scanner.nextLine();
            System.out.print("Objetivo: ");
            String objetivo = scanner.nextLine();
            System.out.print("Data de Lançamento (AAAA-MM-DD): ");
            String data = scanner.nextLine();
            System.out.print("Alvo do Resgate: ");
            String alvo = scanner.nextLine();
            missoes.add(new MissaoResgate(proximoIdMissao++, nome, objetivo, data, alvo));
            System.out.println("Missão de resgate '" + nome + "' adicionada com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao adicionar missão: " + e.getMessage());
        }
    }

    private static void adicionarNaveTripulada(Scanner scanner) {
        try {
            System.out.print("Nome da Nave: ");
            String nome = scanner.nextLine();
            System.out.print("Capacidade de Astronautas: ");
            int capacidade = Integer.parseInt(scanner.nextLine().trim());
            System.out.print("Número de Sistemas de Suporte à Vida: ");
            int suporte = Integer.parseInt(scanner.nextLine().trim());
            naves.add(new NaveTripulada(proximoIdNave++, nome, capacidade, suporte));
            System.out.println("Nave tripulada '" + nome + "' adicionada com sucesso!");
        } catch (NumberFormatException e) {
            System.out.println("Erro: capacidade e suporte devem ser números inteiros.");
        }
    }

    private static void adicionarNaveCarga(Scanner scanner) {
        try {
            System.out.print("Nome da Nave: ");
            String nome = scanner.nextLine();
            System.out.print("Capacidade de Tripulantes: ");
            int capacidade = Integer.parseInt(scanner.nextLine().trim());
            System.out.print("Capacidade de Carga (toneladas): ");
            double carga = Double.parseDouble(scanner.nextLine().trim());
            naves.add(new NaveCarga(proximoIdNave++, nome, capacidade, carga));
            System.out.println("Nave de carga '" + nome + "' adicionada com sucesso!");
        } catch (NumberFormatException e) {
            System.out.println("Erro: valores numéricos inválidos.");
        }
    }

    private static void adicionarAstronauta(Scanner scanner) {
        System.out.print("Nome do Astronauta: ");
        String nome = scanner.nextLine();
        System.out.print("Especialidade: ");
        String especialidade = scanner.nextLine();
        astronautas.add(new Astronauta(proximoIdAstronauta++, nome, especialidade));
        System.out.println("Astronauta '" + nome + "' adicionado com sucesso!");
    }


    private static void listarMissoes() {
        System.out.println("\n--- Lista de Missões ---");
        if (missoes.isEmpty()) { System.out.println("Nenhuma missão cadastrada."); return; }
        missoes.forEach(m -> System.out.println(m));
    }

    private static void listarNaves() {
        System.out.println("\n--- Lista de Naves Espaciais ---");
        if (naves.isEmpty()) { System.out.println("Nenhuma nave cadastrada."); return; }
        naves.forEach(n -> System.out.println(n));
    }

    private static void listarAstronautas() {
        System.out.println("\n--- Lista de Astronautas ---");
        if (astronautas.isEmpty()) { System.out.println("Nenhum astronauta cadastrado."); return; }
        astronautas.forEach(a -> System.out.println(a));
    }


    private static void associarNaveAMissao(Scanner scanner) {
        try {
            System.out.print("ID da Missão: ");
            int idMissao = Integer.parseInt(scanner.nextLine().trim());
            System.out.print("ID da Nave: ");
            int idNave = Integer.parseInt(scanner.nextLine().trim());

            Missao missao = buscarMissaoPorId(idMissao);
            NaveEspacial nave = buscarNavePorId(idNave);

            if (missao == null) throw new IllegalArgumentException("Missão ID " + idMissao + " não encontrada.");
            if (nave == null) throw new IllegalArgumentException("Nave ID " + idNave + " não encontrada.");

            missao.setNave(nave);
            System.out.println("Nave '" + nave.getNome() + "' associada à missão '" + missao.getNome() + "'!");
        } catch (NumberFormatException e) {
            System.out.println("Erro: IDs devem ser números inteiros.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void associarAstronautaAMissao(Scanner scanner) {
        try {
            System.out.print("ID da Missão: ");
            int idMissao = Integer.parseInt(scanner.nextLine().trim());
            System.out.print("ID do Astronauta: ");
            int idAstronauta = Integer.parseInt(scanner.nextLine().trim());

            Missao missao = buscarMissaoPorId(idMissao);
            Astronauta astronauta = buscarAstronautaPorId(idAstronauta);

            if (missao == null) throw new IllegalArgumentException("Missão ID " + idMissao + " não encontrada.");
            if (astronauta == null) throw new IllegalArgumentException("Astronauta ID " + idAstronauta + " não encontrado.");

            missao.adicionarAstronauta(astronauta);
            System.out.println("Astronauta '" + astronauta.getNome() + "' associado à missão '" + missao.getNome() + "'!");
        } catch (NumberFormatException e) {
            System.out.println("Erro: IDs devem ser números inteiros.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }


    private static void atualizarStatusMissao(Scanner scanner) {
        try {
            System.out.print("ID da Missão: ");
            int id = Integer.parseInt(scanner.nextLine().trim());
            System.out.println("Status: 1-Iniciar | 2-Pausar | 3-Finalizar | 4-Cancelar");
            System.out.print("Escolha: ");
            int op = Integer.parseInt(scanner.nextLine().trim());

            Missao missao = buscarMissaoPorId(id);
            if (missao == null) throw new IllegalArgumentException("Missão não encontrada.");

            switch (op) {
                case 1 -> missao.iniciar();
                case 2 -> missao.pausar();
                case 3 -> missao.finalizar();
                case 4 -> { missao.setStatus("Cancelada"); System.out.println("Missão cancelada."); }
                default -> System.out.println("Opção inválida.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: entrada inválida.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void removerMissao(Scanner scanner) {
        try {
            System.out.print("ID da Missão a remover: ");
            int id = Integer.parseInt(scanner.nextLine().trim());
            Missao missao = buscarMissaoPorId(id);
            if (missao == null) throw new IllegalArgumentException("Missão não encontrada.");
            missoes.remove(missao);
            System.out.println("Missão '" + missao.getNome() + "' removida com sucesso!");
        } catch (NumberFormatException e) {
            System.out.println("Erro: ID inválido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void buscarMissoesPorStatus(Scanner scanner) {
        System.out.print("Status desejado (Planejada / Em Andamento / Concluída / Cancelada / Pausada): ");
        String status = scanner.nextLine().trim();
        System.out.println("\n--- Missões com status: " + status + " ---");
        boolean encontrou = false;
        for (Missao m : missoes) {
            if (m.getStatus().equalsIgnoreCase(status)) {
                System.out.println(m);
                encontrou = true;
            }
        }
        if (!encontrou) System.out.println("Nenhuma missão encontrada com esse status.");
    }

    private static void relatorioMissoesConcluidas() {
        System.out.println("\n=== RELATÓRIO DE MISSÕES CONCLUÍDAS ===");
        long total = missoes.stream().filter(m -> m.getStatus().equals("Concluída")).count();
        missoes.stream()
                .filter(m -> m.getStatus().equals("Concluída"))
                .forEach(m -> System.out.println(m));
        System.out.println("Total de missões concluídas: " + total);
    }


    private static Missao buscarMissaoPorId(int id) {
        return missoes.stream().filter(m -> m.getId() == id).findFirst().orElse(null);
    }

    private static NaveEspacial buscarNavePorId(int id) {
        return naves.stream().filter(n -> n.getId() == id).findFirst().orElse(null);
    }

    private static Astronauta buscarAstronautaPorId(int id) {
        return astronautas.stream().filter(a -> a.getId() == id).findFirst().orElse(null);
    }
}