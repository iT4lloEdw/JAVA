public class CalculadoraSimples {
    public static void main (String[] args){
        int a = 15;
        int b = 5;

        int adicao = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;
        int modulo = a % b;

        System.out.println("Resultado da soma a + b é: " + adicao);
        System.out.println("Resultado da subtração a - b é: " + subtracao);
        System.out.println("Resultado da multiplicação a * b é: " + multiplicacao);
        System.out.println("Resultado da divisão a / b é: " + divisao);
        System.out.println("Resultado do resto da divisão a % b é: " + modulo);


    }
}