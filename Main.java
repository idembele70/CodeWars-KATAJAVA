import java.sql.Array;
import java.util.stream.Stream;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        
System.out.println(sum(new int[]{-1,2,3}));
    }

    public static int sum(int [] arr) {
        int sum =0;
        for (int i : arr) {
            if (i > 0) {
                sum += i;
            } 
        }
        return sum;
    }
   
}