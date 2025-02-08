package zoologico;
//Entidade de banco de dados
public class Animal {
    String tipo;
    String comprimento;
    String cor;
    int patas;
    String velocidade;
    String caracteristica;

    public Animal(String tipo, String comprimento, String cor, int patas, String velocidade, String caracteristica) {
        this.tipo = tipo;
        this.comprimento = comprimento;
        this.cor = cor;
        this.patas = patas;
        this.velocidade = velocidade;
        this.caracteristica = caracteristica;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "tipo='" + tipo + '\'' +
                ", comprimento='" + comprimento + '\'' +
                ", cor='" + cor + '\'' +
                ", patas=" + patas +
                ", velocidade='" + velocidade + '\'' +
                ", caracteristica='" + caracteristica + '\'' +
                '}';
    }
}
