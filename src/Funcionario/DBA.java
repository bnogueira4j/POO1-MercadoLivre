package Funcionario;

public class DBA extends Funcionario {
    private String acessos;

    public void migrarBancoDados(){
        System.out.println("Migrando banco de dados de dados");
    }

    public void normalizarDados() {
        System.out.println("Normalizando dados de dados");
    }

    public String getAcessos() {
        return acessos;
    }
}
