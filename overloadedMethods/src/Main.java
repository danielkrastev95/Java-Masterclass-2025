public class Main {
    public static void main(String[] args) {

        System.out.println("Your height in centimeters from 68 inches is: "
                + convertToCentimeters(68) + "cm");

        System.out.println("Your height in centimeters from 6 foots and 2 inches is: "
                + convertToCentimeters(5,8) + "cm");

    }

    public static double convertToCentimeters(int inches){
        // Convert inches to centimeters and pass back the number of centimeters as a double
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches){
        //Convert feet and inches just inches, then call the first method
        //  to get the number of centimeters, also returning the value as a double
        int feetToInches = feet * 12;
        int totalInches = feetToInches + inches;

        return convertToCentimeters((totalInches));
    }
}
