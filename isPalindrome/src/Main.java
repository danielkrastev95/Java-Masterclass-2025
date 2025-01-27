public class Main {
    public static void main(String[] args) {
        isPalindrome(232);
    }


    public static boolean isPalindrome(int number){

        int reverse = 0;
        int originalNumber = number;
        System.out.println("The number you want to check if it is palindrome is: "+number);
        System.out.println("");


        while(number != 0){
            int lastDigit = number % 10; // Saca el ultimo digito

            reverse = reverse * 10 + lastDigit; // Añade el digito al numero reverso

            number = number / 10; // Resta el digito al numero principal

        }

        System.out.println("The reverse of the given number is: "+reverse);

        if(originalNumber == reverse){
            System.out.println(originalNumber +" == " + reverse);
            System.out.println("The given number is palindrome");
            return true;
        }else{
            System.out.println(originalNumber +" != " + reverse);
            System.out.println("The given number is NOT palindrome");
            return false;
        }
    }

}