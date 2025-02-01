package Produto;

import java.security.InvalidParameterException;

public class Produto {
    String codigo;
    String descricao;
    double precoUnitario;
    int quantidade;

    public Produto(String codigo, String descricao, double precoUnitario, int quantidade) throws Exception {
        if(precoUnitario <= 0) {
            throw new InvalidParameterException("Valor do produto nao pode ser igual ou menor que zero");
        }
        this.codigo = codigo;
        this.descricao = descricao;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

}
