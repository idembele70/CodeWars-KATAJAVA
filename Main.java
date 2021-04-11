/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(makeNegative(-12));
    }

    public static int makeNegative(final int x) {
        return Math.negateExact(Math.abs(x));
}
}