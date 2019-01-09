/**
 * Temel tüketim olan ve buğday unundan üretilen ekmek ve türevleri ile lüks olmayan barınma ihtiyaçlarında %1 KDV uygulanmaktadır
 * Buğday unu, buğday unundan üretilen hamburger ekmeği, tost ekmeği ve sandviç ekmeği gibi ekmekler, yufka gibi
 */
public class BasicProduct extends Product {
    BasicProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculatePriceWithTax() {
        return getPrice() * 1.01;
    }
}
