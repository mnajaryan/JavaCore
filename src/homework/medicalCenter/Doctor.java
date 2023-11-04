package homework.medicalCenter;

public class Doctor extends Person{
    private String profession;

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Doctor(String id, String name, String surname, String email, String phone, String profession) {
        super(id, name, surname, email, phone);
        this.profession = profession;
    }

    public Doctor() {
    }
}
