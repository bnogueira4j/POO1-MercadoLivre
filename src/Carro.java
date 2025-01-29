public class Carro extends Veiculo implements Abastecimento {
    private int portas;

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

    public int getPortas() {
        return portas;
    }

    @Override
    public void abastecer() {
        System.out.println("Abastecer carro com FLEX");
    }

    @Override
    public String toString() {
        return "Carro{" +
                "portas=" + portas +
                ", cor='" + getCor() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", placa='" + getPlaca() + '\'' +
                ", ano=" + getAno() +
                '}';
    }
}
