public class Car {
    private String brand;
    private int distance;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSpeed(int speed) {
        this.distance = speed * 24;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getDistance() {
        return this.distance;
    }
}
