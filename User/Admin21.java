package User;
/**
 * Admin21
 */
public class Admin21 extends User21 {

    public void update_vehicle_details(int vehicle_id) {
        System.out.println("Vehicle details updated for vehicle id : " + vehicle_id);
    }

    public void add_vehicle() {
        System.out.println("Vehicle have been added.");
    }

    public void retrieve_complain() {
        System.out.println("Retrieved complaints from users about the vehicles or the system.");
    }

    public void verify_user() {
        System.out.println("User verification is initiated.");
    }
}