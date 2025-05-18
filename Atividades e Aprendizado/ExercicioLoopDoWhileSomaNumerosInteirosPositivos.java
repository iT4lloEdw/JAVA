public class ExercicioLoopDoWhileSomaNumerosInteirosPositivos {
    public static void main (String[] args) {

        int valor = 10;    // número até onde somamos
        int contador = 1; // começa em 1, que é o primeiro número a somar
        int soma = 0;     // acumulador para guardar a soma

        do {
            soma+= contador;
            contador++;

        } while (contador <= valor);

        System.out.println("A soma dos números de 1 até " + valor + " é: " + soma);
    }
}