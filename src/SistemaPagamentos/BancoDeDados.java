package SistemaPagamentos;

import SistemaPagamentos.Pagamentos.Pagamento;
import SistemaPagamentos.Recebimento.Recebimento;

import java.util.List;

public abstract class BancoDeDados {
    public static List<Pagamento> lotePagamentos = GeradorLotePagamento.gerarLote(50);
    public static List<Recebimento> loteRecebimento = List.of();

    public static void salvar(Pagamento pagamento) {
        lotePagamentos.add(pagamento);
    }

    public static void salvar(Recebimento recebimento) {
        loteRecebimento.add(recebimento);
    }
}
