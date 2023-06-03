package mashin;

public class BottelofMilk extends Product {
    private double volume;
    private int fatContent;

    /**
     * @return int return the volume
     */
    public double getVolume() {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * @return int return the fatContent
     */
    public int getFatContent() {
        return fatContent;
    }

    /**
     * @param fatContent the fatContent to set
     */
    public void setFatContent(int fatContent) {
        this.fatContent = fatContent;
    }

    public BottelofMilk(String brand, String name, double price, double volume, int fatContent) {
        super(brand, name, price);
        this.volume = volume;
        this.fatContent = fatContent;
    }

    public String displayInfo() {
        return String.format("[Бутылка]%s-%s-%f[Объем: %f; жирность: %d]", brand, name, price, volume, fatContent);
    }

}
