// Bir abstract interface'i kapsar ancak bir abstract extend edilebilirken birden çok interface implement edebilir
// Kendisinden nesne direk türetilmez, metotlar ise olduğu gibi kullanılabilir owerride da edilebilir
public abstract class Product {
    private String name;
    private double price;

    public abstract double calculatePriceWithTax();

    public String toString() {
        return getName() + " = " + calculatePriceWithTax() + " Tl";
    }

    Product(String name, double price) {
        if (price > 0) {
            this.name = name;
            this.price = price;
        } else {
            System.out.println("Price could not be less than 0!");
        }
    }

    private String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }
}
