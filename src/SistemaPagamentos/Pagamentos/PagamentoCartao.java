package SistemaPagamentos.Pagamentos;

import SistemaPagamentos.Cartao;

import java.time.LocalDate;

public class PagamentoCartao extends Pagamento {
    private Cartao tipoCartao;
    public PagamentoCartao(Cartao cartao, String beneficiario, double valor, LocalDate vencimento) {
        super(beneficiario, valor, vencimento);
        this.tipoCartao = cartao;
    }

    @Override
    void processar() {
        System.out.println("[codigo: "+ getCodigo() + " , tipo: Cartao."+ tipoCartao +"] O pagamento processado com sucesso.");
    }
}
