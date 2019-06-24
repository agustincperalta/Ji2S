package Exercises9;

public class SafeSensorTester {

    public static void main(String[] args) {
        SafeSensor sfs1 = new SafeSensor(10);
        SafeSensor sfs2 = new SafeSensor(12, 2);
        System.out.println(sfs2.getMax());
        System.out.println(sfs2.getPressure());
        if (sfs2.setPressure(5)){
            System.out.println("value updated");
        }else{
            System.out.println("value not updated, try with another valid value");
        }
    }
}
