public class Continue {
    public static void main (String[] args) {

       for (int j = 0; j < 10; j++) {

            if (j == 5) {

                continue; // Pula a interação quando j é igual a 5
            }

            System.out.println(j);

       }

    }
}