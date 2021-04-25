
public class Main {
    public static void main(String[] args) {
        String namer = "joh";
        System.out.println(String.format(" %s!",namer));
        System.out.println(greet("Johnny"));
    }

    public static String greet(String name) {
        if (name.equals("Johnny")) {
            return "Hello, my love!";
        } else {
            return "Hello, "+name+"!";
        }
    }
}