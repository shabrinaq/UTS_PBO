package UTS.User;
/**
 * UserProfile21
 */
public class UserProfile21 {

    private int user_id;
    private String password;
    private String name;
    private int age;
    private String email_id;
    private String doc;         //bisa berupa .jpg, .png, .pdf

    public UserProfile21(int user_id, String password, String name, int age, String email_id) {
        this.user_id = user_id;
        this.password = password;
        this.name = name;
        this.age = age;
        this.email_id = email_id;
    }
    
    public int getUser_id() {
        return user_id;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email_id;
    }

    public void edit_profile(String name, int age, String email_id) {
        this.name = name;
        this.age = age;
        this.email_id = email_id;

        System.out.println("Profile updated : " + name + ", " + age + ", " + email_id);
    }

    public void show_documents() {
        System.out.println("Documents : " + doc);
    }
}