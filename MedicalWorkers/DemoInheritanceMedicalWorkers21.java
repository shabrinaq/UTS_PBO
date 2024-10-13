package MedicalWorkers;
/**
 * DemoInheritanceMedicalWorkers21
 */
public class DemoInheritanceMedicalWorkers21 {

    public static void main(String[] args) {
        Doctor21 doctor = new Doctor21("Dr. Sofia Margen", 35, "Female", 10, "Obstetrics and Gynecology", "Permata Bunda Hospital");
        doctor.displayInfoDoctor();
        doctor.treatPatient();

        System.out.println("------------------------------------------------------------------");

        Nurse21 nurse = new Nurse21("Nurse Axel", 28, "Male", 5, "Night Shift");
        nurse.displayInfoNurse();
        nurse.giveMedication();
    }
}