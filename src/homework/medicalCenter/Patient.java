package homework.medicalCenter;

public class Patient extends Person{
    Doctor doctor;
    String registerDateTime;

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getRegisterDateTime() {
        return registerDateTime;
    }

    public void setRegisterDateTime(String registerDateTime) {
        this.registerDateTime = registerDateTime;
    }

    public Patient(String id, String name, String surname, String email, String phone, Doctor doctor, String registerDateTime) {
        super(id, name, surname, email, phone);
        this.doctor = doctor;
        this.registerDateTime = registerDateTime;
    }

    public Patient() {
    }
}
