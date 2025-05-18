public class ExercicioLoopForSomaDeValoresAcumulados {
    public static void main (String[] args) {

        int soma = 0;

        for (int i = 1; i <= 10; i++) {
            soma += i;
        }
        
        System.out.println("A soma de 1 a 10 é: " + soma);

    }
}