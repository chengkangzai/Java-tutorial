package Tutorial3;

/**
 * DemoStatic
 */
public class DemoStatic {

    //static mean its belong a class
    static int id =202;
    static String name ="Darren";
    int idd=203;

    public static void main(String[] args) {
        System.out.println(id);
        System.out.println(name);
        //Object NonStatic 
        DemoStatic object = new DemoStatic();
        System.out.println(object.idd);
        
    }
}