package ExerciciosFixacaoPOO.ExercicioQuatro;

public class Carro {

        private String marca;
        private String modelo;
        private int ano;
        private double velocidadeMaxima;


        public Carro(String marca, String modelo, int ano, double velocidadeMaxima) {
            this.marca = marca;
            this.modelo = modelo;
            this.ano = ano;
            this.velocidadeMaxima = velocidadeMaxima;
        }


        public int calcularIdadeCarro() {
            return 2026 - ano;
        }


        public void exibirDados() {
            System.out.println("====== Dados do Carro ======");
            System.out.println("Marca : " + marca);
            System.out.println("Modelo : " + modelo);
            System.out.println("Ano : " + ano);
            System.out.printf("Vel. Máx.: %.1f km/h%n", velocidadeMaxima);
            System.out.println("Idade : " + calcularIdadeCarro() + " anos");
            System.out.println("===========================");
        }


        public String getMarca() { return marca; }
        public String getModelo() { return modelo; }
        public int getAno() { return ano; }
        public double getVelocidadeMaxima() { return velocidadeMaxima; }


        public void setMarca(String marca) { this.marca = marca; }
        public void setModelo(String modelo) { this.modelo = modelo; }
        public void setAno(int ano) { if (ano > 0) this.ano = ano; }
        public void setVelocidadeMaxima(double v) { if (v > 0) this.velocidadeMaxima = v; }
    }

