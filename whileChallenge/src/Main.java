public class Main {
    public static void main(String[] args) {

        int num = 4;
        int countEven = 1;
        int countOdd = 1;

        while(num <= 20){
            num++;
            if(isEvenNumber(num) && countEven <= 5){
                countEven++;
                System.out.println("Even numbers: "+num);
            }
            if(!isEvenNumber(num) && countOdd <= 5){
                countOdd++;
                System.out.println("Odd numbers: "+num);
            }
        }
    }

    public static boolean isEvenNumber(int number){
        return (number % 2 == 0) ? true : false;
    }
}