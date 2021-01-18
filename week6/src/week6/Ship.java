package week6;
public class Ship extends Vehicle implements Floatable{
    public Ship(){
        super(0.0);
    }
    public Ship(double fuel){
        setFuel(fuel);
    }
    public void move(){
        flOat();
    }
    public void move(int distance){
        for(int i = 0; i < distance; i++){
            this.flOat();
            if(getFuel() - 50 < 50){
                break;
            }
        }
    }
    public void flOat(){
        System.out.println("Ship moves");
        if(getFuel() - 50 >= 50){
            setFuel(getFuel() - 50);
        }
        else{
            System.out.println("Fuel is not enough.");
        }
    }
    public void startEngine(){
        System.out.println("Engine Starts");
        if(getFuel() - 10 >= 10){
            setFuel(getFuel() - 10);
        }
        else{
            System.out.println("Fuel is not enough.");
        }
    }
    public void stopEngine(){
        System.out.println("Engine Stops");
    }
    public void honk(){
        System.out.println("Shhhhh");
    }
    
}
