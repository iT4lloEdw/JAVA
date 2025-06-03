public class Carro {
	String marca;
	String modelo;
	int ano;

	// Construtor padrão
	Carro() {
		marca = "Indefinido";
		modelo = "Infefinido";
		ano = 0;
	}
	
	// Construtor com marca e modelo
	Carro(String marcaInit, String modeloInit) {
		marca = marcaInit;
		modelo = modeloInit;
	}

	// Construtor com marca, modelo e ano
	Carro(String marcaInit, String modeloInit, int anoInit) {
		marca = marcaInit;
		modelo = modeloInit;
		ano = anoInit;
	}

	// Método main para testar os construtores
	public static void main(String[] args) {

		// Testando construtor com todos os atributos
		Carro carro1 = new Carro("BYD", "Dolphin Mini", 2024);

		// Testando construtor com marca e modelo
		Carro carro2 = new Carro("Toyota", "Corolla");

		// Testando construtor padrão
		Carro carro3 = new Carro();
	
		System.out.println("Marca: " + carro1.marca);
		System.out.println("Modelo: " + carro1.modelo);
		System.out.println("Ano: " + carro1.ano);
		System.out.println("-----------------------------");

		System.out.println("Marca: " + carro2.marca);
		System.out.println("Modelo: " + carro2.modelo);
		System.out.println("Ano: " + carro2.ano);
		System.out.println("-----------------------------");

		System.out.println("Marca: " + carro3.marca);
		System.out.println("Modelo: " + carro3.modelo);
		System.out.println("Ano: " + carro3.ano);
	}
}
