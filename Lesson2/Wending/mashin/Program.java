package mashin;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Product product1 = new Product();
        // product1.brand = "ООО Шишкин лес";
        // product1.name = "Бутылка с водой";
        // product1.price = 120.5;
        System.out.println(product1.displayInfo());

        Product product2 = new Product("ООО Шишкин лес", "Бутылка с молоком", -113);
        // product2.brand = "ООО Шишкин лес";
        // product2.name = "Бутылка с молоком";
        // product2.price = 111;
        product2.setPrice(-30);
        System.out.println(product2.displayInfo());

        BottelOfWater bottelOfWater1 = new BottelOfWater("Coca-Cola", "Cola Ligth", 50, 0.5);
        System.out.println(bottelOfWater1.displayInfo());

        Product bottleOfMilk = new BottelofMilk("Mу-Му", "канистра молока", 150, 1, 3);
        System.out.println(bottleOfMilk.displayInfo());

        Product shocolate = new Shocolate("Бабаевский", "Шоколадка", 95.5, "Молочный", 90);
        System.out.println(bottleOfMilk.displayInfo());

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(bottelOfWater1);
        products.add(bottleOfMilk);
        products.add(shocolate);

        VendingMashin vendingMashin = new VendingMashin(products);
        BottelOfWater bottelOfWaterResult = vendingMashin.getBottelOfWater(0.5);
        if (bottelOfWaterResult != null) {
            System.out.println("Вы купили:");
            System.out.println(bottelOfWaterResult.displayInfo());
        } else {
            System.out.println("Такой бутылки нет в аппарате!");

        }

        // VendingMashin vendingMashin1 = new VendingMashin(products);
        Shocolate shocolateResult = vendingMashin.getShocolate(90);
        if (shocolateResult != null) {
            System.out.println("Вы купили:");
            System.out.println(shocolateResult.displayInfo());
        } else {
            System.out.println("Такой шоколадки нет в терминале!");
        }
    }
}
