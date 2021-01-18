package week3;
public class Cat {
    private String name;
    private String color;
    public double height;
    public double weight;
    public void setWeight(double w){
        weight = w;
    }
    public void setHeight(double h){
        height = h;
    }
    public void setName(String n){
        name = n;
    }
    public void setColor(String c){
        color = c;
    }
    public void upWeight(double w){
        double num = weight;
        setWeight(weight + w);
        if (weight <= 0){
            System.out.println("Error");
            setWeight(num);
        }
    }
    public void downWeight(double w){
        double num = weight;
        setWeight(height - w);
        if (weight <= 0){
            System.out.println("Error");
            setWeight(num);
        }
    }
    public void upHeight(double h){
        double num = height;
        setHeight(height + h);
        if (height <= 0){
            System.out.println("Error");
            setHeight(num);
        }
    }
    public void defineCat(String n, String c){
        setName(n);
        setColor(c);
    }
    public void speak(){
        System.out.println("Name : "+ name);
        System.out.println("Color : "+ color);
        System.out.println("Height : "+ height);
        System.out.println("Weight : "+ weight);
    }
}
