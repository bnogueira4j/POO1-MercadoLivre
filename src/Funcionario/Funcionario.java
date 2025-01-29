package Funcionario;

import java.util.List;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private String rg;
    private String telefone;
    private String cargo;
    private double salario;

    public String getNome(String acesso) {
        if(acesso.equals("ADMIN")) {
            return nome + " ...." ;
        } else {
            return null;
        }
    }

    public void setCargo(String novoCargo, String tipoDoFuncionario) throws Exception {
        if(tipoDoFuncionario.equals("Desenvolvedor")) {
            var listaDeCargos = List.of("JUNIOR", "PLENO", "SENIOR");
            if(listaDeCargos.contains(novoCargo)) {
                this.cargo = novoCargo;
            } else {
                throw new Exception("Cargo invalido: " +novoCargo+ " para esse tipo de Funcionario: " + tipoDoFuncionario);
            }

        }

    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
