package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public static void printEvenNumbers(int printTillInclusive) {
        int counter = 0;

        while (counter <= printTillInclusive) {
            System.out.println(counter);
            counter+=2;
        }
    }
    public static void main(String[] args) {
        printEvenNumbers(19);
    }
}
