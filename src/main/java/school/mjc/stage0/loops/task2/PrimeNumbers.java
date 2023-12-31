package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public static void printPrimeNumbers(int printToInclusive) {
        int counter = 2;

        while (counter <= printToInclusive) {
            if (isPrime(counter)) {
                System.out.println(counter);
            }
            counter++;
        }
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        int i = 2;
        while (i <= Math.sqrt(n)) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }

        return true;
    }
    public static void main(String[] args) {
        printPrimeNumbers(100);
    }
}
