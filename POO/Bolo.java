public class Bolo {

	int quantidadeAcucar;
	
	public static void main (String[] args) {

		Bolo boloDeChocolate = new Bolo();

		boloDeChocolate.quantidadeAcucar = 200;

		Bolo boloDeBaunilha = new Bolo();

		boloDeBaunilha.quantidadeAcucar = 170;

		System.out.println("Quantidade de açúcar no bolo de chocolate: " + boloDeChocolate.quantidadeAcucar);

		System.out.println("Quantidade de açúcar no bolo de baunilha: " + boloDeBaunilha.quantidadeAcucar);

	}
}	