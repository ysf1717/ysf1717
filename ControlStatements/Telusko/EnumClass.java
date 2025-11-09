package ControlStatements.Telusko;

enum Laptop{
    Macbook(50000), LenovoYoga(450000), Dell, Asus(39500);

    private int price;

    private Laptop() {

        price = 500;// default constructor
    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}

public class EnumClass {

    public static void main(String[] args) {
        // Laptop lap = Laptop.Macbook;
        // System.out.println(lap + ":" + lap.getPrice());

        for (Laptop lap: Laptop.values())
        {
            System.out.println(lap + ": "  + lap.getPrice());
        }

    }

}
