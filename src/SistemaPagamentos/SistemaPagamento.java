package SistemaPagamentos;

import SistemaPagamentos.Pagamentos.Pagamento;
import SistemaPagamentos.Pagamentos.PagamentoBoleto;
import SistemaPagamentos.Recebimento.Recebimento;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class SistemaPagamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String beneficiario = scanner.next();
        String valor = scanner.next();

        System.out.println(BancoDeDados.lotePagamentos.size());
        Pagamento pagamento = new PagamentoBoleto(beneficiario, Double.valueOf(valor), LocalDate.now());
        BancoDeDados.salvar(pagamento);
        System.out.println(BancoDeDados.lotePagamentos.size());

        BancoDeDados.salvar(pagamento);
        var recebimento = new Recebimento();

        BancoDeDados.salvar(recebimento);

//        for (Pagamento pagamentoAtual : BancoDeDados.lotePagamentos) {
//            try{
//                pagamentoAtual.processarPagamento();
//            } catch(DateTimeException ex) {
//                System.out.println(ex.getMessage());
//            }
//        }
    }
}
