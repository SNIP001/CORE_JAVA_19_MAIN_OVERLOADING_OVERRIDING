package $19_MainTest_overloading_overriding;


public class App {
    public static void main(String[] args) {
        System.out.println("default main method");
        main(10);
    }
    public static void main(int args) {
        System.out.println("overloaded main method");
    }
    
}
