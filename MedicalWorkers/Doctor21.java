package MedicalWorkers;
/**
 * Doctor21
 */
public class Doctor21 extends MedicalWorkers21 {

    private String specialization;
    private String hospital;

    public Doctor21(String name, int age, String gender, int workExperience, String specialization, String hospital) {
        super(name, age, gender, workExperience); 
        this.specialization = specialization; 
        this.hospital = hospital;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public void displayInfoDoctor() {
        super.displayInfoMedicalWorkers(); 
        System.out.println("Specialization  : " + this.specialization);
        System.out.println("Hospital        : " + this.hospital);
    }

    public void treatPatient() {
        System.out.println("Doctor " + this.getName() + " is treating a patient at the moment.");
    }
}