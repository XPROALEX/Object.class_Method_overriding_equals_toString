import java.util.Objects;

public class Smartphone implements Cloneable {
    private String brandName;
    private String modelName;
    private int batterymAh;
    private SmartphonePrice producerPrice;
    private SmartphonePrice retailPrice;

    public Smartphone(String brandName, String modelName, int batterymAh, SmartphonePrice prodP, SmartphonePrice retailP) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.batterymAh = batterymAh;
        this.producerPrice = prodP;
        this.retailPrice = retailP;
    }

    @Override
    public String toString() {
        return "-------\n" + "Smartphone{" +
                "brandName='" + brandName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", batterymAh=" + batterymAh +
                ", ProducerPrice=" + producerPrice +
                ", RetailPrice=" + retailPrice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Smartphone that)) return false;
        return batterymAh == that.batterymAh && Objects.equals(brandName, that.brandName) && Objects.equals(modelName, that.modelName) && Objects.equals(producerPrice, that.producerPrice) && Objects.equals(retailPrice, that.retailPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batterymAh, producerPrice, retailPrice);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Smartphone clonedSmartphone = (Smartphone) super.clone();
        clonedSmartphone.producerPrice = this.producerPrice;
        clonedSmartphone.retailPrice = this.retailPrice;
        return clonedSmartphone;
    }

}