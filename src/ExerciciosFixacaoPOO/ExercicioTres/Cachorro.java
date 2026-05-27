package ExerciciosFixacaoPOO.ExercicioTres;

public class Cachorro {

    private String nome;
    private String raca;
    private int idade;
    private double peso;

    public Cachorro(String nome, String raca, int idade, double peso) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.peso = peso;
    }

    public void exibirInformacoes() {
        System.out.println("===== Ficha do Cachorro =====");
        System.out.println("Nome : " + nome);
        System.out.println("Raça : " + raca);
        System.out.println("Idade : " + idade + " anos");
        System.out.printf("Peso : %.1f kg%n", peso);
        System.out.println("Porte : " + classificarTamanho());
        System.out.println("=============================");
    }

    public String classificarTamanho() {
        if (peso < 15) {
            return "Pequeno";
        } else if (peso <= 30) {
            return "Médio";
        } else {
            return "Grande";
        }
    }

    public String getNome() { return nome; }
    public String getRaca() { return raca; }
    public int getIdade() { return idade; }
    public double getPeso() { return peso; }

    public void setNome(String nome) { this.nome = nome; }
    public void setRaca(String raca) { this.raca = raca; }
    public void setIdade(int idade) { if (idade >= 0) this.idade = idade; }
    public void setPeso(double peso) { if (peso > 0) this.peso = peso; }
}

