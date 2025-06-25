import empresa.dados.Funcionario;

public class FolhaDePagamento {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Itallo", 5000.00);
        funcionario.aumentarSalario(100d);


        System.out.println(funcionario.obterInfo());

       
    }
}
