package SistemaPagamentos.Pagamentos;

import java.time.LocalDate;
import java.util.UUID;

public class PagamentoBoleto extends Pagamento {
    private String codigoBarra;

    public PagamentoBoleto(String beneficiario, double valor, LocalDate vencimento) {
        super(beneficiario, valor, vencimento);
        this.codigoBarra = UUID.randomUUID().toString();
    }

    @Override
    void processar() {
        System.out.println("[codigo: "+ getCodigo() + " , tipo: Boleto] O pagamento processado com sucesso.");
    }
}
