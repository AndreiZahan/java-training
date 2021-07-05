package code._4_student_effort._4_challengeFour;

public class Bike {
    private int vin;
    private String brand;

    public Bike(int vin, String brand) {
        this.vin = vin;
        this.brand = brand;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "vin=" + vin +
                ", brand='" + brand + '\'' +
                '}';
    }


}
