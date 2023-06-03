package mashin;

public class Product {

    protected String name;

    protected String brand;

    protected double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        checkPrice(price);
    }

    public Product() {
        this("product", 133);

        // brand = "noname";
        // name = "product";
        // price = 100;
    }

    public Product(String inputName, double inputPrice) {
        this("domik v derewne", inputName, inputPrice);
        // brand = "noname";
        // name = inputName;
        // price = inputPrice;
    }

    public Product(String brand, String name, double price) {
        if (brand == null || brand.length() < 4) {
            this.brand = "noname";
        } else {
            this.brand = brand;
        }

        if (name == null || name.length() < 2) {
            this.name = "product";
        } else {
            this.name = name;

        }
        checkPrice(price);

    }

    private void checkPrice(double price) {
        if (price <= 0) {
            price = 100;
        } else {
            this.price = price;
        }
    }

    public String displayInfo() {
        return String.format("%s-%s-%f", brand, name, price);
    }
}