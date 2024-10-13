package MedicalWorkers;
/**
 * MedicalWorkers21
 */
public class MedicalWorkers21 {

    private String name;
    private int age;
    private String gender;
    private int workExperience;

    public MedicalWorkers21(String name, int age, String gender, int workExperience) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.workExperience = workExperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public void displayInfoMedicalWorkers() {
        System.out.println("Name            : " + this.name);
        System.out.println("Age             : " + this.age);
        System.out.println("Gender          : " + this.gender);
        System.out.println("Work Experience : " + this.workExperience + " years");
    }
}