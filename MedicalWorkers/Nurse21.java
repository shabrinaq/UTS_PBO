package MedicalWorkers;
/**
 * Nurse21
 */
public class Nurse21 extends MedicalWorkers21 {

    private String shift;

    public Nurse21(String name, int age, String gender, int workExperience, String shift) {
        super(name, age, gender, workExperience); 
        this.shift = shift; 
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public void displayInfoNurse() {
        super.displayInfoMedicalWorkers(); 
        System.out.println("Shift           : " + this.shift);
    }

    public void giveMedication() {
        System.out.println("Nurse " + this.getName() + " is giving medicine to the patient.");
    }
}
