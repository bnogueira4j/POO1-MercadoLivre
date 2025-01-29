public class Moto extends Veiculo implements Abastecimento {
    private boolean temCapacete;

    public Moto(String cor, String modelo, String placa, int ano, boolean temCapacete) {
        super(cor, modelo, placa, ano);
        this.temCapacete = temCapacete;
    }

    public void darPartida() {
        System.out.println("Partida da Moto");
    }

    public boolean isTemCapacete() {
        return temCapacete;
    }

    @Override
    public void abastecer() {
        System.out.println("Abastecer moto com GASOLINA");
    }

    @Override
    public String toString() {
        return "Moto{" +
                "temCapacete=" + temCapacete +
                ", cor='" + getCor() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", placa='" + getPlaca() + '\'' +
                ", ano=" + getAno() +
                '}';
    }
}
