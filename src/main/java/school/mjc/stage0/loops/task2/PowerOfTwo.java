package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public static void printPower(int power) {
        if (power<0) {
            System.out.println("too much power");
            return;
        }

        int counter = 0;

        while (counter<=power) {
            System.out.println((int) Math.pow(2, counter));
            counter++;
        }
    }
    public static void main(String[] args) {
        printPower(1);
    }
}
