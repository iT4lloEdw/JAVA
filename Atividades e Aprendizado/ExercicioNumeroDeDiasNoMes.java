public class ExercicioNumeroDeDiasNoMes {
    public static void main (String[] args) {

        String mês = "Fevereiro";
        String dias = switch (mês) {
        case "Janeiro", "Março", "Maio", "Julho","Agosto", "Outubro", "Dezembro" -> "O Número de Dias do Mês escolhido é 31.";
        case "Abril", "Junho", "Setembro", "Novembro" -> "O Número de Dias do Mês escolhido é 30.";
        case "Fevereiro" -> "Considerando um ano não bissexto, o mês escolhido possui 28 dias.";
        default -> "Mês desconhecido.";
        };

        System.out.println(dias);
    }
}