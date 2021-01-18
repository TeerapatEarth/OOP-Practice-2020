package week4;
public class Plane extends Vehicle{
    public void showPlaneInfo(){
        System.out.println("Plane detail is, Fuel is "+
                getFuel()+" litre and Top Speed is "+getTopSpeed()+" m/s.");
    }
    public void setPlaneInfo(int s, String t){
        setFuel(s);
        setTopSpeed(t);
    }
    public void fly(){
        int fuelleft = getFuel()-200;
        if(fuelleft > 0){
            setFuel(fuelleft);
            System.out.println("Fly.");
        }
        else{
            System.out.println("Please add fuel.");
        }
    }
}
