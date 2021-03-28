import java.sql.Array;
import java.util.stream.Stream;

/**
 * Main
 */
public class Main {
    public static void main(String[] args){System.out.println(even_or_odd(6));}

    public static String even_or_odd(int number){
        return number % 2 == 0 ? "Even" : "Odd";
    }
}