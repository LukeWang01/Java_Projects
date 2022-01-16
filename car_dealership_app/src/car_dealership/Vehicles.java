package car_dealership;

import java.util.Objects;

public class Vehicles {
    private double carPrice;
    private String carNmae;
    private String carBrand;
    private String carOwner;

    @Override
    public String toString() {
        return "Vehicles{" +
                "carPrice=" + carPrice +
                ", carNmae='" + carNmae + '\'' +
                ", carBrand='" + carBrand + '\'' +
                ", carOwner='" + carOwner + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicles vehicles = (Vehicles) o;
        return Double.compare(vehicles.carPrice, carPrice) == 0 && carNmae.equals(vehicles.carNmae) && carBrand.equals(vehicles.carBrand) && carOwner.equals(vehicles.carOwner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carPrice, carNmae, carBrand, carOwner);
    }

    public Vehicles(double carPrice, String carNmae, String carBrand, String carOwner) {
        this.carPrice = carPrice;
        this.carNmae = carNmae;
        this.carBrand = carBrand;
        this.carOwner = carOwner;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }

    public String getCarNmae() {
        return carNmae;
    }

    public void setCarNmae(String carNmae) {
        this.carNmae = carNmae;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(String carOwner) {
        this.carOwner = carOwner;
    }
}
