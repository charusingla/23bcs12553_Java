class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
    }
}

class Electronics extends Product {
    int warrantyYears;

    Electronics(String name, double price, int warrantyYears) {
        super(name, price);
        this.warrantyYears = warrantyYears;
    }

    @Override
    void displayDetails() {
        System.out.println("--- Electronics ---");
        System.out.println("Name: " + name);
        System.out.println("Price: ₹" + price);
        System.out.println("Warranty: " + warrantyYears + " years");
    }
}

class Clothing extends Product {
    String size;

    Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    void displayDetails() {
        System.out.println("--- Clothing ---");
        System.out.println("Name: " + name);
        System.out.println("Price: ₹" + price);
        System.out.println("Size: " + size);
    }
}

public class Main {
    public static void main(String[] args) {

        Product p1 = new Electronics("Smartphone", 32000, 1);
        Product p2 = new Clothing("Jacket", 1599, "L");

        p1.displayDetails();
        System.out.println();
        p2.displayDetails();
    }
}
