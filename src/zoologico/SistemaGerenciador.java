package zoologico;

public class SistemaGerenciador {
    public static void main(String[] args) {
        Mamifero urso = new Mamifero(TipoMamifero.URSO, "2m", "Pardo", 4, "30/km", "Intolerante mel");
        BancoDedados.salvar(urso);

        Peixe tubarao = new Peixe(TipoPeixe.TUBARAO, "1.8m", "Cinza", "60/km", "Carnivoro");
        BancoDedados.salvar(tubarao);

        Peixe peixeEspada = new Peixe(TipoPeixe.PEIXE_ESPADA, "1.8m", "Cinza", "60/km", "Carnivoro");
        BancoDedados.salvar(peixeEspada);

        Peixe atum = new Peixe(TipoPeixe.ATUM, "1.8m", "Cinza", "60/km", "Carnivoro");
        BancoDedados.salvar(atum);


        BancoDedados.imprimirDados();
    }
}
