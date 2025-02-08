package zoologico;

public class Peixe extends Animal {

    public Peixe(TipoPeixe tipo, String comprimento, String cor, String velocidade, String caracteristica) {
        super(tipo.toString(), comprimento, cor, 0, velocidade, caracteristica);
    }
}
