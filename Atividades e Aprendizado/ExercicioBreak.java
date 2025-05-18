public class ExercicioBreak {
    public static void main (String[] args) {

        int codigoDeSaida = 9; // valor para interromper o laço
    

        for (int codigoCarteirinha = 1; codigoCarteirinha <= 10; codigoCarteirinha++) {

            if (codigoCarteirinha == codigoDeSaida) {


                // para o laço se o código for igual a 9
                break;
            }

            if (codigoCarteirinha == 3 || codigoCarteirinha == 7 || codigoCarteirinha == 10) {
                System.out.println("Código " + codigoCarteirinha + " é aceito pelo Hospital Santa Clara.");
                continue;
            }

            System.out.println("Código " + codigoCarteirinha + " não é aceito pelo Hospital Santa Clara.");


        }


    }
}