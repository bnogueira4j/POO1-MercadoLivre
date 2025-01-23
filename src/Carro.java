public class Carro extends Veiculo {
    int portas;

    public Carro(String cor, String modelo, String placa, int ano, int portas) {
        super(cor, modelo, placa, ano);
        this.portas = portas;
    }

    void ligar() {
        System.out.println("Ligando carro");
    }

    void desligar() {
        System.out.println("Desligando carro");
    }


    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "portas=" + portas +
                ", cor='" + cor + '\'' +
                ", modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                ", ano=" + ano +
                '}';
    }
}
