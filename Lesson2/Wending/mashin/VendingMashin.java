package mashin;

import java.util.List;

public class VendingMashin {

    private List<Product> products;

    public VendingMashin(List<Product> products) {
        this.products = products;
    }

    public BottelOfWater getBottelOfWater(double volume) {
        for (Product product : products) {
            if (product instanceof BottelOfWater) {
                if (((BottelOfWater) product).getVolume() == volume) {
                    return (BottelOfWater) product;
                }
            }
        }
        return null;

    }

    public Shocolate getShocolate(double weight) {
        for (Product product : products) {
            if (product instanceof Shocolate) {
                if (((Shocolate) product).getWeight() == weight) {
                    return (Shocolate) product;
                }
            }
        }
        return null;
    }

}