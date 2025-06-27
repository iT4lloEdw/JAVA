class SalaDeAula {
    
    static int totalAlunos = 0;

    
    static void adicionarAluno() {
        totalAlunos++;
    }

    static void mostrarTotalAlunos() {
        System.out.println("Total de alunos: " + totalAlunos);
    }
}

public class TesteSalaDeAula {
	public static void main (String[] args) {

		 SalaDeAula.adicionarAluno();
		 SalaDeAula.adicionarAluno();
		 SalaDeAula.adicionarAluno();

		 SalaDeAula.mostrarTotalAlunos();
	}
}
