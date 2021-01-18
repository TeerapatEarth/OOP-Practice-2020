package week6;
public class Plane extends Vehicle implements Flyable{
    private String airline;
    private String boeing;
    private static final int MAX_FLYER = 2;
    public Plane(){
        this(0.0, "", "");
    }
    public Plane(double fuel, String airline, String boeing){
        setFuel(fuel);
        this.airline = airline;
        this.boeing = boeing;
    }
    public void setAirline(String airline){
        this.airline = airline;
    }
    public void setBoeing(String boeing){
        this.boeing = boeing;
    }
    public String getAirline(){
        return airline;
    }
    public String getBoeing(){
        return boeing;
    }
    public void startEngine(){
        System.out.println("Plane's Engine starts");
        if(getFuel()-20 >= 20){
            setFuel(getFuel() - 20);
        }
        else{
            System.out.println("Fuel is not enough.");
        }
    }
    public void stopEngine(){
        System.out.println("Plane's Engine stops");
    }
    public void honk(){
        System.out.println("Weeeeeee");
    }
    public void fly(){
        System.out.println("Plane Fly");
        if(getFuel() - 20 >= 20){
            setFuel(getFuel() - 20);
        }
        else{
            System.out.println("Fuel is nearly empty.");
        }
    }
    public void takeOff(){
        System.out.println("Plane Already to Take Off");
        if(getFuel()-10 >= 10){
            setFuel(getFuel() - 10);
        }
        else{
            System.out.println("Fuel is nearly empty");
        }
    }
    public void landing(){
        System.out.println("Plane Already to Landing");
        if(getFuel()-10 >= 10){
            setFuel(getFuel() - 10);
        }
        else{
            System.out.println("Fuel is nearly empty");
        }
    }
}
