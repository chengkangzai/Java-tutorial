package Tutorial1;

public class Tutorial1 {

    // Data Type
    // Example : String, int, bool,
    //
    // In Java , Type of Data
    // 1. PRIMITIVE DATA TYPE
    // --> Byte(8 bit),Short(),int,long
    // --> Float, Double
    // --> Char
    // -- Lower Case
    // 2. OBJECT Type
    //
    // AutoBoxing
    // Integer i3= new Integer(300);
    // Integer i4=300;
    public static void main(final String[] args) {
        final int a = 200;
        final int b = 300;
        final int result = a + b;
        System.out.println("Your Result it: " + result);

        final double f1 = 1.1;
        final double f2 = 9.9;
        final double result2 = f1 + f2;
        System.out.printf("%.2f\n",result2);
    }

}
