public class PrecedenciaOperadoresAtribuicao {
    public static void main (String[] args) {

        int numero = 5;
        
     // Pré-incremento
    System.out.println("Valor antes do pré-incremento: " + numero);
    numero = numero + 1;
    System.out.println("Valor após o pré-incremento: " + numero);

    // Pós-incremento
    System.out.println("Valor antes do pós-incremento: " + numero);
    numero = numero + 1;
    System.out.println("Valor após o pós-incremento: " + numero);

    // Pré-decrementos
    System.out.println("Valor antes do pré-decremento: " + numero);
    numero = numero - 1;
    System.out.println("Valor após o pré-decremento: " + numero);
    
    // Pós-decremento
    System.out.println("Valor antes do pós-decremento: " + numero);
    numero = numero - 1;
    System.out.println("Valor após o pós-decremento: " + numero);


    }
}