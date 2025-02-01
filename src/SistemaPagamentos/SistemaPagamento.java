package SistemaPagamentos;

import SistemaPagamentos.Pagamentos.Pagamento;

import java.time.DateTimeException;

public class SistemaPagamento {
    public static void main(String[] args) {
        var lotePagamentos = GeradorLotePagamento.gerarLote(100);

        for (Pagamento pagamentoAtual : lotePagamentos) {
            try{
                pagamentoAtual.processarPagamento();
            } catch(DateTimeException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
