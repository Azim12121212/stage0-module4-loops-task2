package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public static void buildPhrase(char... chars) {
        if (chars.length==0) {
            System.out.println("No characters provided!");
        }

        System.out.print(chars);
    }
    public static void main(String[] args) {
        buildPhrase('d');
    }
}
