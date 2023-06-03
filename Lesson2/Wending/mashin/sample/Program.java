package mashin.sample;

import mashin.Product;

public class Program {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.brand = "ООО Шишкин лес";
        product1.name = "Бутылка с водой";
        product1.price = 120.5;
        System.out.println(product1.displayInfo());

        Product product2 = new Product("ООО Шишкин лес", "Бутылка с молоком", 113);
        // product2.brand = "ООО Шишкин лес";
        // product2.name = "Бутылка с молоком";
        // product2.price = 111;
        System.out.println(product2.displayInfo());

    }

}
