package SistemaPagamentos.Pagamentos;

import java.time.LocalDate;
import java.util.UUID;

public class PagamentoPix extends Pagamento {
    private String qrCode;
    private String chave;

    public PagamentoPix(String beneficiario, double valor, LocalDate vencimento) {
        super(beneficiario, valor, vencimento);
        this.qrCode = UUID.randomUUID().toString();
        this.chave = qrCode.substring(0, 4);
    }

    @Override
    void processar() {
        System.out.println("[codigo: "+ getCodigo() + " , tipo: Pix] O pagamento processado com sucesso.");
    }
}
