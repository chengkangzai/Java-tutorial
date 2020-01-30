package Tutorial3;

/**
 * Tutorial3
 */
public class Tutorial3 {
    // Member Variable
    int id = 101;
    String name = "john";

    public static void main(String[] args) {
        //Belong to other Class
        System.out.println(DemoStatic.id +DemoStatic.name);
        //System.out.println(DemoStatic.name);
    }

    public void disp(int count) {
        System.out.println(id);
        System.out.println(name);
        System.out.println(count);
    }

    public void next() {
        // Local Variable
        int count = 0;
        disp(count);
        

    }
}