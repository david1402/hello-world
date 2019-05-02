package HelloWorld;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        boolean flag = true;
        System.out.println("Hello world");
        System.out.println("Hello David");
        System.out.println("Hello from Andrew");
        System.out.println("Hello again");
        System.out.println("and again");
        while(flag != false) {
            System.out.println("I'm alive!");
            Thread.sleep(1000);
        }
    }
}
