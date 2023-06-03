package mashin;

public class BottelOfWater extends Product {
    private double volume;

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

    public BottelOfWater(String brand, String name, double price, double volume) {
        super(brand, name, price);
        this.volume = volume;

    }

    public String displayInfo() {
        return String.format("[Бутылка]%s-%s-%f[Объем: %f]", brand, name, price, volume);
    }
}
