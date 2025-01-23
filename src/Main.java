public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("vermelho", "Fusca", "ABC123", 1969, 4);
        System.out.println(carro);

        carro.ligar();
        carro.mover();
        carro.desligar();

        Moto moto = new Moto("azul", "Honda", "CVC143", 2001, true);
        System.out.println(moto);
        moto.mover();
        moto.darPartida();

        Veiculo veiculo = new Veiculo("vermelho", "Fusca", "ABC123", 2008);

        System.out.println(veiculo);
    }
}
