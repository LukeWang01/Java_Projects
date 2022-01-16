package car_dealership;

public class Employee {

    public void handleCustomer(Customer cust, boolean finance, Vehicles vehicle){
        System.out.println("Car info:");
        System.out.println(vehicle.toString());
        System.out.println("---------------------------------");

        if (finance){
            double carPrice = vehicle.getCarPrice();
            if (runCreditHistory(cust, carPrice)){
                processTransaction(cust, vehicle);
            }else{
                System.out.println("Please bring more money");
            }
        }else if (vehicle.getCarPrice() <= cust.getCashFlow()){
            processTransaction(cust, vehicle);
        }else {
            System.out.println("Please bring more money");
        }
    }

    public boolean runCreditHistory(Customer cust, double amount){
        return cust.getCashFlow() > amount * 2;
    }

    public void processTransaction(Customer cust, Vehicles vehicle){
        System.out.println("Customer cashFlow before purchase: " + cust.getCashFlow());
        cust.setCarOwned(vehicle.getCarNmae());
        vehicle.setCarOwner(cust.getName());
        cust.setCashFlow(cust.getCashFlow() - vehicle.getCarPrice());
        System.out.println(cust.getName() + "Customer owns: " + cust.getCarOwned());
        System.out.println(vehicle.getCarNmae() + "Car is owned by: " + cust.getName());
        System.out.println("Customer cashFlow remains: " + cust.getCashFlow());
    }
}
