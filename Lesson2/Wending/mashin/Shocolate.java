package mashin;

public class Shocolate extends Product {
    private String variety;
    private double weight;

    /**
     * @return String return the variety
     */
    public String getVariety() {
        return variety;
    }

    /**
     * @param variety the variety to set
     */
    public void setVariety(String variety) {
        this.variety = variety;
    }

    /**
     * @return String return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Shocolate(String brand, String name, double price, String variety, double weight) {
        super(brand, name, price);
        this.variety = variety;
        this.weight = weight;

    }

    public String displayInfo() {
        return String.format("[Плитка шоколада]%s-%s-%f [Сорт: %s; Масса в граммах: %s]", brand, name, price, variety,
                weight);
    }

}
