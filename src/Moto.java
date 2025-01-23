public class Moto extends Veiculo{
    boolean temCapacete;

    public Moto(String cor, String modelo, String placa, int ano, boolean temCapacete) {
        super(cor, modelo, placa, ano);
        this.temCapacete = temCapacete;
    }

    public void darPartida() {
        System.out.println("Partida da Moto");
    }

    @Override
    public String toString() {
        return "Moto{" +
                "temCapacete=" + temCapacete +
                ", cor='" + cor + '\'' +
                ", modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                ", ano=" + ano +
                '}';
    }
}
