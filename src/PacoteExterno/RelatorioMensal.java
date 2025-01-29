package PacoteExterno;

import Funcionario.Funcionario;
import Funcionario.Desenvolvedor;

import java.util.Scanner;

public class RelatorioMensal extends Funcionario {


    public static void main(String[] args) {
        System.out.println("Sistema ajuste de desenvolvedores!");
        Scanner entrada = new Scanner(System.in);
        Funcionario dev = new Desenvolvedor();

        boolean continua = true;
        while (continua) {
            try {
                System.out.println("Digite o cargo do desenvolvedor:");
                String novoCargo = entrada.next();
                System.out.println("Digite o salario:");
                double novoSalario = Double.parseDouble(entrada.next());

                dev.setCargo(novoCargo, "Desenvolvedor");
                dev.setSalario(novoSalario);
                System.out.println("Cargo alterado do desenvolvedor para: " + dev.getCargo());
                System.out.println("Salario alterado para: " + dev.getSalario());
            } catch(NumberFormatException e) {
                System.out.println("ERRO: O salario deve ser apenas numeros.");
                continue;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                continue;
            }

            System.out.println();
            System.out.println();
            System.out.println("Deseja Continuar? (S/N)");
            continua = "S".equals(entrada.next());
        }
    }

}
