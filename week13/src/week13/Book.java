package week13;


public class Book {
    private String name;
    private double price;
    private String type;
    public Book(){}
    public Book(String name, double price, String type){
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
    
}
