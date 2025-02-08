package zoologico;

public class Mamifero extends Animal{

    public Mamifero(TipoMamifero tipoMamifero, String comprimento, String cor, int patas, String velocidade, String caracteristica) {
        super(tipoMamifero.toString(), comprimento, cor, patas, velocidade, caracteristica);
    }
}
