public class ExercicioDeterminandoOnivelDeSatisfacao {
    public static void main (String[] args) {

        int nivel = 5;

        String feedback = switch (nivel) {

        case 1 -> "Muito Satisfeito";
        case 2 -> "Incrivel";
        case 3 -> "Fantástico";
        default -> "Inválido, pois a nota precisa estar entre 1 á 3!";

        };

        System.out.println(feedback);



    }
}