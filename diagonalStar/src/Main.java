public class Main {
    public static void main(String[] args) {
        printSquareStar(10);
    }

    public static void printSquareStar(int number) {
        // Verifica si el número es menor que 5
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        // Bucle para cada fila
        for (int row = 0; row < number; row++) {
            // Bucle para cada columna
            for (int col = 0; col < number; col++) {

                // Condiciones para imprimir un asterisco
                if (row == 0 || row == number - 1 || col == 0 || col == number - 1 || row == col || col == number - row - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Nueva línea después de cada fila
            System.out.println();
        }
    }
}