package singleton;

public class Main {
    public static void main(String[] args) {
        Object singleton = new Object();
        System.out.println("isSingleton (expect true) " + SingletonTester.isSingleton(() -> singleton));

        System.out.println("isSingleton (expect false) " + SingletonTester.isSingleton(Object::new));
    }
}
