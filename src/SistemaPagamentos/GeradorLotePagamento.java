package SistemaPagamentos;

import SistemaPagamentos.Pagamentos.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeradorLotePagamento {
    private static Random gerador = new Random();
    public static List<Pagamento> gerarLote(int quantidade) {
        List<Pagamento> lotePagamentos = new ArrayList<>();

        for (int i = 0; i < quantidade; i++) {
            double valor = Math.random();
            int tipoPagamento = gerador.nextInt(3);

            switch (tipoPagamento) {
                case 0:
                    lotePagamentos.add(
                            new PagamentoCartao(Cartao.geradorCartaoAleatorio(), "ITAU", valor, LocalDate.of(2025, 2 ,28))
                    );
                    break;
                case 1:
                    lotePagamentos.add(
                            new PagamentoBoleto("ENEL", valor, LocalDate.of(2025, 2 ,28))
                    );
                    break;
                case 2:
                    lotePagamentos.add(new PagamentoPix("CARREFOUR", valor, LocalDate.of(2025, 2 ,28)));
                    break;
            }
        }
        return lotePagamentos;
    }
}
