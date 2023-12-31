package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public static void printFactorialRow(int printToInclusive) {
        if (printToInclusive<0) {
            System.out.println("Factorial of negative number is undefined!");
            return;
        }

        int result=1;
        int counter = 0;

        while (counter<=printToInclusive) {
            if (counter==0 || counter==1) {
                System.out.println(1);
            } else {
                result*=counter;
                System.out.println(result);
            }
            counter++;
        }
    }
    public static void main(String[] args) {
        printFactorialRow(3);
    }
}
