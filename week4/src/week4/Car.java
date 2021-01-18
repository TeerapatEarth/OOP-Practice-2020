package week4;
public class Car extends Vehicle {
    private String typeEngine;
    public void setTypeEngine(String t){
        typeEngine = t;
    }
    public String getTypeEngine(){
        return typeEngine;
    }
    public void setCarInfo(int s, String t, String y){
        setFuel(s);
        setTopSpeed(t);
        typeEngine = y;
    }
    public void showCarInfo(){
        System.out.println("Car engine is "+getTypeEngine()+".");
        System.out.println("Fuel is "+getFuel()+" litre and Top Speed is "
                +getTopSpeed()+" m/s.");
    }
    public void move(){
        int fuelleft = getFuel() - 50;
        if(fuelleft > 0){
            setFuel(fuelleft);
            System.out.println("Move.");
        }
        else{
            System.out.println("Please add fuel.");
        }
    }
}
