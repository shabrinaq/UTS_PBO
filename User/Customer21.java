package User;
/**
 * Customer21
 */
public class Customer21 extends User21 {

    private boolean verification_status = false;

    public boolean get_verification_status() {
        return verification_status;
    }

    public void apply_verification(String doc) {
        this.verification_status = true;

        System.out.println("Verification with document : " + doc);
    }
}