/**
 * Temel tüketim olmayan tüm ürünler (birkaç istisna hariç), %18’lik KDV dilimine dâhil olmaktadır
 * Telekomünikasyon ürünleri, Beyaz Eşyalar, Mobilyalar gibi
 */
public class OtherProduct extends Product {
    OtherProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculatePriceWithTax() {
        return getPrice() * 1.18;
    }
}
