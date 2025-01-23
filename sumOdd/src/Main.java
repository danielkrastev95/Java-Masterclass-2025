public class Main {
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 10)); // Ejemplo de prueba
    }

    public static boolean isOdd(int number) {
        if (number > 0) {
            return number % 2 != 0; // Devuelve true si el número es impar
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        if (start <= 0 || end <= 0 || end < start) {
            return -1; // Condición de entrada inválida
        }

        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i; // Suma los números impares
            }
        }

        return sum; // Retorna la suma total de números impares
    }
}