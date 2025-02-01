package SistemaPagamentos;

import java.util.Random;

public enum Cartao {
    BASIC, PLATINUM, GOLD, BLACK, DIAMOND;

    private static final Random RANDOM = new Random();

    public static Cartao geradorCartaoAleatorio() {
        Cartao[] cartao = Cartao.values();
        return cartao[RANDOM.nextInt(5)];
    }
}

