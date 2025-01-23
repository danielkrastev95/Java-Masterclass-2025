public class SecondClass {
    public static void main(String[] args) {
        System.out.println("Hello World");

        double number = 20.00;
        double number2 = 80.00;

        double number3 = (number + number2) * 100.00;
            System.out.println(number3);
        number3 = number3 % 40.00;
            System.out.println("the remainder: " + number3);

        boolean isZero = (number3 == 0.00) ? true : false;
        System.out.println(isZero);

        if(!isZero){
            System.out.println("Got some remainder");
        }




    }

}
