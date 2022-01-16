package car_dealership;

public class Customer {

    private String name;
    private String address;
    private double cashFlow;
    private String carOwned;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name + "HaHa";
    }

    public String getAddress() {
        return address;
    }

    public double getCashFlow() {
        return cashFlow;
    }

    public void setCashFlow(double cashFlow) {
        this.cashFlow = cashFlow;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCarOwned() {
        return carOwned;
    }

    public void setCarOwned(String carOwned) {
        this.carOwned = carOwned;
    }

    public void purchaseCar(Vehicles vehicle, Employee emp, boolean finance){
        emp.handleCustomer(this, finance, vehicle);
    }

}
