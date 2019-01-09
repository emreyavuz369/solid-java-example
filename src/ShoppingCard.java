import java.util.ArrayList;
import java.util.List;

class ShoppingCard {
    private List<Product> products;

    ShoppingCard() {
        this.products = new ArrayList<>();
    }

    void addToShoppingCard(Product product) {
        products.add(product);
        System.out.println(product + " sepete eklendi");
    }

    void removeFromShoppingCard(Product product) {
        if (products.remove(product)) {
            System.out.println(product + " sepetten çıkarıldı");
        } else {
            System.out.println(product + " sepette bulunamadı!");
        }
    }

    void calculateTotalOrder() {
        double totalOrder = 0;
        for (Product product : products) {
            totalOrder += product.calculatePriceWithTax();
        }
        System.out.println(products.size() + " adet ürün alışverişiniz " + totalOrder + " Tl tuttu");
    }
}
