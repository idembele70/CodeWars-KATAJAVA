
public class Main {
    public static void main(String[] args) {
        System.out.println(repeatStr(4, "a"));
    }

    public static String repeatStr(final int repeat, final String string) {
        String stringRepeated ="";
        for (int i = 0; i < repeat; i++) {
            stringRepeated+=string;
        }
        return stringRepeated;
    }
}