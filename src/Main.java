public class Main {
    public static void main(String[] args) {
        ShoppingCard shoppingCard = new ShoppingCard();

        Product b1 = new BasicProduct("Tost Ekmeği", 4);
        shoppingCard.addToShoppingCard(b1);
        // shoppingCard.removeFromShoppingCard(b1);

        Product b2 = new BakeryProduct("Süt", 2.5);
        shoppingCard.addToShoppingCard(b2);
        // shoppingCard.removeFromShoppingCard(b2);

        Product b3 = new OtherProduct("Mouse", 25);
        shoppingCard.addToShoppingCard(b3);
        // shoppingCard.removeFromShoppingCard(b3);

        shoppingCard.calculateTotalOrder();
    }
}
