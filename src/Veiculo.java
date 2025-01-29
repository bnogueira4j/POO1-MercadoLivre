public abstract class Veiculo {
    private String cor;
    private String modelo;
    private String placa;
    private int ano;
    private int velocidade;

    public static final int VELOCIDADE_MAXIMA = 200;

    public Veiculo(String cor, String modelo, String placa, int ano) {
        this.cor = cor;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }

    void mover() {
        if(velocidade <= VELOCIDADE_MAXIMA) {
            System.out.println("Esta se movendo: " + placa);
        } else {
            System.out.println("ERRO!");
        }
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

    public int getVelocidade() {
        return velocidade;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "cor='" + cor + '\'' +
                ", modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                ", ano=" + ano +
                '}';
    }


}
