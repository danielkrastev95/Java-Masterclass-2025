public class Main {
    public static void main(String[] args) {
        System.out.println("it is a perfect number? " + isPerfectNumber(6));
    }

    public static boolean isPerfectNumber(int number){
        // if the number is 0 or negative, return false
        if(number < 1){
            return false;
        }

        int sumOfDivisors = 0;

        for (int i=1; i < number; i++){
            if(number % i == 0){
                sumOfDivisors += i;
                System.out.println(sumOfDivisors);
            }
        }

        if(sumOfDivisors == number){
            return true;
        }

    return false;
    }
}