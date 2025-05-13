public class ExercicioVerificacaoDeAprovacaoComBaseEmNotasEPresenca {
    public static void main (String[] args) {

            int nota1 = 7;
            int nota2 = 7;
            double frequencia = 75.0D;
            double mediaNotas = (nota1 + nota2) / 2;

            if (mediaNotas >= 7 && frequencia >= 75) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");

            }
        }
    }