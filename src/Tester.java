public class Tester {
    public static void main(String[] args) {
        SmartphonePrice retailPrice1 = new SmartphonePrice("€", 700);
        SmartphonePrice retailPrice2 = new SmartphonePrice("€", 900);

        SmartphonePrice producerPrice1 = new SmartphonePrice("€", 500);
        SmartphonePrice producerPrice2 = new SmartphonePrice("€", 700);

        Smartphone smartphone1 = new Smartphone("Samsung", "S21", 4000, producerPrice1, retailPrice1);
        Smartphone smartphone2 = new Smartphone("Apple", "14", 3500, producerPrice2, retailPrice2);

        System.out.println(smartphone1.toString());
        System.out.println(smartphone2.toString());

        System.out.println("\nThe smartphones are equals? " + smartphone1.equals(smartphone2));

        try {
            Smartphone clonedSmartphone = (Smartphone) smartphone2.clone();
            System.out.println(clonedSmartphone.toString());
            System.out.println("\nThe smartphones are equals? " + smartphone2.equals(clonedSmartphone));
        } catch (Exception exception) {
            System.err.println("Error!");
            exception.printStackTrace();
        }
    }
}