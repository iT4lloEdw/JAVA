public class Funcionario {
	String nome;
	String cargo;
	int idade;
	public static void main (String[] args) {

		Funcionario funcionario1 = new Funcionario();
		funcionario1.nome = "Itallo";
		funcionario1.cargo = "Desenvolvedor Jr.";
		funcionario1.idade = 20;
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.nome = "Zeca";
		funcionario2.cargo = "Gerente";
		funcionario2.idade = 32;

		System.out.println("Nome: " + funcionario1.nome);
		System.out.println("Cargo: " + funcionario1.cargo);
		System.out.println("Idade: " + funcionario1.idade);
		System.out.println("-----------------------------");
		System.out.println("Nome: " + funcionario2.nome);
		System.out.println("Cargo: " + funcionario2.cargo);
		System.out.println("Idade: " + funcionario2.idade);

	}	
}