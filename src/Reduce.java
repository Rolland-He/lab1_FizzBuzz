public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int count = 0;
        boolean divisibleBy2 = n % 2 == 0;
        while (n > 0){
            if (divisibleBy2){
                n = n / 2;
                count += 1;
            }
            else {
                n = (n - 1) /2;
                count += 1;
                }
        }
        System.out.println(count);
    }
}