import empresa.dados.Funcionario;

public class FolhaDePagamento {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Itallo", 5000.00);
        System.out.println(funcionario.obterInfo());

        double d = 2400;
        funcionario.aumentarSalario(d);
        d = d + 100;
        System.out.println(funcionario.obterInfo());
    }
}
