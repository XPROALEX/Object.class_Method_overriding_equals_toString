import java.util.Objects;

public class SmartphonePrice implements Cloneable {
    private String priceType;
    private double PriceInEuros;

    public SmartphonePrice(String type, double price) {
        this.priceType = type;
        this.PriceInEuros = price;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        SmartphonePrice clonedSmartphonePrice = (SmartphonePrice) super.clone();
        return clonedSmartphonePrice;
    }

    @Override
    public String toString() {
        return priceType + ' ' + PriceInEuros;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartphonePrice that = (SmartphonePrice) o;
        return Double.compare(PriceInEuros, that.PriceInEuros) == 0 && Objects.equals(priceType, that.priceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceType, PriceInEuros);
    }
}
