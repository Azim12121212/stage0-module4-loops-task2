package school.mjc.stage0.loops.task2;

public class Multiplication {
    public static void printMultiplied(int multiplyByAndToInclusive) {
        int counter = 0;

        if (multiplyByAndToInclusive<0) {
            int positive = -1 * multiplyByAndToInclusive;

            while (counter >= multiplyByAndToInclusive) {
                System.out.println(counter*positive);
                counter--;
            }
        } else if (multiplyByAndToInclusive>0) {
            while (counter <= multiplyByAndToInclusive) {
                System.out.println(counter*multiplyByAndToInclusive);
                counter++;
            }
        }
    }
    public static void main(String[] args) {
        printMultiplied(-5);
    }
}
