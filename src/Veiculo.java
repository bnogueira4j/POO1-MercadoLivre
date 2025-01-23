public class Veiculo {
    String cor;
    String modelo;
    String placa;
    int ano;

    public Veiculo(String cor, String modelo, String placa, int ano) {
        this.cor = cor;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }

    void mover() {
        System.out.println("Esta se movendo");
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "cor='" + cor + '\'' +
                ", modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                ", ano=" + ano +
                '}';
    }
}
