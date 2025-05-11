public class SwitchCaseInitialization {
    public static void main (String[] args) {

        String dia = "Sábado";

        String tipoDeDia = switch (dia) {

            case "Seg.", "Ter.", "Qua.", "Qui.", "Sex." -> "Dia útil";
            case "Sábado", "Domingo" -> "Fim de Semana";
            default -> "Desconhecido";
        };

        System.out.println(tipoDeDia); // Fim de Semana


    }
}