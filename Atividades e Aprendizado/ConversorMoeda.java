public class ConversorMoeda {
   public static void main (String [] args) {
      double dolar = 100.0D;
      double taxaCambio = 5.20D;
      double valorConvertido = dolar * taxaCambio;

      System.out.println("O valor convertido de dólar para Reais é: " + valorConvertido);
   }
}