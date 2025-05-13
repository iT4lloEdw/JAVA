public class ExercicioVerifcadorDeMes {
    public static void main (String[] args) {

            int mês = 8;
            switch (mês) {
            case 1 -> System.out.println("Janeiro");
            case 2 -> System.out.println("Fevereiro");
            case 3 -> System.out.println("Março");
            case 4 -> System.out.println("Abril");
            case 5 -> System.out.println("Maio");
            case 6 -> System.out.println("Junho");
            case 7 -> System.out.println("Julho");
            case 8 -> System.out.println("Agosto");
            default -> System.out.println("Desconhecido");
            }
        }
    }