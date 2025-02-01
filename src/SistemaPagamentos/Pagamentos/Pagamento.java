package SistemaPagamentos.Pagamentos;

import java.security.InvalidParameterException;
import java.time.DateTimeException;
import java.time.LocalDate;

public abstract class Pagamento {
    private int codigo;
    private String beneficiario;
    private double valor;
    private LocalDate vencimento;


    private static int contador = 1;

    public Pagamento(String beneficiario, double valor, LocalDate vencimento) {
        this.codigo = contador++;
        this.beneficiario = beneficiario;
        this.valor = valor;
        this.vencimento = vencimento;
    }

    public void processarPagamento() {
        if(this.valor <= 0) {
            throw new InvalidParameterException("[codigo: "+ codigo + "] Valor deve ser maior que zero.");
        }
        if(LocalDate.now().isAfter(vencimento)) {
            throw new DateTimeException("[codigo: "+ codigo + "] A data está vencida.");
        }
        processar();
    }

    public int getCodigo() {
        return codigo;
    }

    abstract void processar();
}
