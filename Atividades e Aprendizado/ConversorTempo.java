public class ConversorTempo {
   public static void main (String[] args){
      int minutosTotais = 130;
      int horasCompletas = minutosTotais / 60;
      int minutosRestantes = minutosTotais % 60;

      System.out.println("Essa minutagem possui esse valor em horas: " + horasCompletas);
      System.out.println("Minutos restantes do valor em horas: " + minutosRestantes);
   }
}