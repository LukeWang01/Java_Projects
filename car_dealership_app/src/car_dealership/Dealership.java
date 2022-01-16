package car_dealership;

public class Dealership {

    public static void main(String[] args) {

        Customer cust1 = new Customer();
        cust1.setName("Luke");
        cust1.setAddress("NJ");
        cust1.setCashFlow(20000);

        Vehicles vehicle = new Vehicles(4000, "Mazda Sport 6", "Mazda","None");

        Employee emp = new Employee();
        cust1.purchaseCar(vehicle, emp, false);

    }
}
