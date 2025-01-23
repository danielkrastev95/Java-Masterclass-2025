public class Main {
    public static void main(String[] args) {
        System.out.println("The total sum of the digits of the number is: " + sumDigits(1234));
    }

    public static int sumDigits(int number){

        if(number < 0){
            System.out.println("Invalid Value was passed");
            return -1;
        }

        int sum = 0;
        while(number > 0){
            sum += number % 10;
            number = number / 10;
        }

        return sum;
    }
}