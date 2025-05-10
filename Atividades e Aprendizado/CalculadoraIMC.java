public class CalculadoraIMC {
   public static void main (String [] args){
      double peso = 73.0;
      double altura = 1.73;
      double calculoIMC = peso / (altura * altura);

      System.out.println("Valor IMC é: " + calculoIMC);
   }
}