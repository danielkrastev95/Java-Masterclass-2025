public class Main {
    public static void main(String[] args) {
        System.out.println("The greatest common divisor is: "+getGreatestCommonDivisor(12,30));

    }

    public static int getGreatestCommonDivisor(int first, int second){

        // Check the range
        if(first < 10 || second < 10){
            return -1;
        }

        int smaller = Math.min(first, second);
        int gcd = 1;


        for (int i = 1; i <= smaller; i++) {
            if (first % i == 0 && second % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }

}