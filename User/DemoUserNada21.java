package UTS.User;
/**
 * DemoUserNada21
 */
public class DemoUserNada21 {

    public static void main(String[] args) {
        UserProfile21 userProfile = new UserProfile21(1, "uwon6529", "Jungwon", 20, "jungwon29@gmail.com");
        userProfile.edit_profile("Yang Jungwon", 21, "yangjungwon29@gmail.com");

        Customer21 customer = new Customer21();
        customer.log_in(1, "uwon6529");
        customer.apply_verification("doc.pdf");
        
        Admin21 admin = new Admin21();
        admin.log_in(2, "adminSofia123");
        admin.update_vehicle_details(2905);
        admin.retrieve_complain();
        admin.verify_user();

        System.out.println("----------------------------------------");
        customer.log_out();
        admin.log_out();
        System.out.println("----------------------------------------");
    }
}