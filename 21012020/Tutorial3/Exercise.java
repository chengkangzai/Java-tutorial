package Tutorial3;

/**
 * Exercise
 */
public class Exercise {

    public static void main(final String[] args) {
        System.out.println("This is Q1 Answer");
        q1();
        System.out.println("This is Q2 Answer");
        q2();
        System.out.println("The end of the Exercise");
    }

    public static void q2() {
        Double price = 45.35D;
        int unit = 10;
        Double answer = price * unit;
        // System.out.println("Your Result it: " + result);
        System.out.printf("%.2f\n", answer);
    }

    public static void q1() {
        final String fLine = "This is the First Line";
        final String sLine = "This is the Second Line";
        System.out.println(fLine);
        System.out.println(sLine);

    }
}