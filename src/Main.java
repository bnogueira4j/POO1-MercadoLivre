import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Veiculo> veiculosGerados = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Carro carro = new Carro("vermelho", "Fusca", "CAR" + i, 1969, 4);
            veiculosGerados.add(carro);

            CarroEletrico carroEletrico = new CarroEletrico("vermelho", "Fusca", "CAR" + i, 1969);
            veiculosGerados.add(carroEletrico);

            Moto moto = new Moto("azul", "Honda", "MOT" + i, 2001, true);
            veiculosGerados.add(moto);
        }

       //MovimentacaoDeVeiculos.movimentar(veiculosGerados);
        for (Veiculo veiculo : veiculosGerados) {
            //veiculo.abastecer(); //Vamos resolver na proxima aula
        }
    }
}
