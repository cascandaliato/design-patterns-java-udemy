package state;

public class Main {
    public static void main(String[] args) {
        CombinationLock cl = new CombinationLock(new int[]{1, 2, 3, 4});
        System.out.println(cl.status);
        cl.enterDigit(1);
        System.out.println(cl.status);
        cl.enterDigit(2);
        System.out.println(cl.status);
        cl.enterDigit(3);
        System.out.println(cl.status);
        cl.enterDigit(4);
        System.out.println(cl.status);
    }
}
