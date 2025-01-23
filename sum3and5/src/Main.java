public class Main {
    public static void main(String[] args) {

        int count = 0;
        int sum = 0;

        int number = 2;
        number % 2 ? true : false;

        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.println(i + " is divided by both 3 and 5");
                count++;
                sum+=i;
                if(count == 5){
                    System.out.println("We already found 5 numbers that met the conditions");
                    System.out.println("The sum of this numbers is: "+ sum);
                    break;
                }
            }
        }

    }
}