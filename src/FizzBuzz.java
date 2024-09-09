/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {
        int i = 1;
//
        while (i < 100){
//        for (int i = 1; i < 100; i++) {

            i = doFizzBuzz(i);
        }
    }

    private static int doFizzBuzz(int i) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {
            i += 1;
            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {
            i += 1;
            System.out.println("Fizz");

        } else if (divisibleBy5) {
            i += 1;
            System.out.println("Buzz");

        } else {
            i += 1;
            System.out.println(i);

        }
        return i;
    }
}
