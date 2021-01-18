package week3;

public class Phone {
    private String brandName;
    private boolean hasFM;
    private boolean hasCamera;
    private double price;
    private int space;
    public static void turnOn(){
        System.out.println("On");
    }
    public static void call(String name){
        System.out.println("Calling to "+name);
    }
    public static void turnOff(){
        System.out.println("Off");
    }
}
