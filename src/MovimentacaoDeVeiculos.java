import java.util.List;

public class MovimentacaoDeVeiculos {

    //SEM POLIMORFISMO
//    public static void movimentarCarro(List<Carro> carros) {
//        for (Carro carro : carros) {
//            carro.mover();
//        }
//    }
//
//    public static void movimentarMoto(List<Moto> listaDeMotos) {
//        for (int i = 0; i < listaDeMotos.size(); i++) {
//            Moto moto = listaDeMotos.get(i);
//            moto.mover();
//        }
//    }


    //COM POLIMORFISMO
    public static void movimentar(List<Veiculo> listaDeVeiculos) {
        for (Veiculo veiculo : listaDeVeiculos) {
            veiculo.mover();
        }
    }
}
