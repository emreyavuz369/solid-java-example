/**
 * Unlu mamuller haricinde lüks olmayan temel tüketim mallarında %8 KDV uygulanmaktadır
 * Süt, süt tozu, yoğurt, ayran, yumurta, peynir, kuru fasulye, nohut, mercimek gibi
 */
public class BakeryProduct extends Product {
    BakeryProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculatePriceWithTax() {
        return getPrice() * 1.08;
    }
}
