public class ExercicioVerificacaoDeAprovacaoSimplificada {
    public static void main (String[] args) {
        int nota1 = 5;
        int nota2 = 5;
        int media = (nota1 + nota2) / 2;
        
        if (media >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}