public class Produto {
	private String nome;
	private double preco;
	private int quantidadeEmEstoque;

	public Produto(String nomeInit, double precoInit, int quantidadeInit) {

		nome = nomeInit;
		preco = precoInit;
		quantidadeEmEstoque = quantidadeInit;

	}

	public void exibirInfo() {

		System.out.println("Nome: " + nome);
		System.out.println("Preço: " + preco);
		System.out.println("Quantidade em Estoque: " + quantidadeEmEstoque);
	}





}