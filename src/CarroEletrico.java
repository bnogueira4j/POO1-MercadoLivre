public class CarroEletrico extends Veiculo {
    int cargaBateria;

    public CarroEletrico(String cor, String modelo, String placa, int ano) {
        super(cor, modelo, placa, ano);
    }

    public void recarregar(){
        System.out.println("Recarregando carro");
    }
}
