package homework.medicalCenter.storage;

import homework.medicalCenter.Doctor;

import java.util.Arrays;

public class DoctorStorage {
    private Doctor[] doctors= new Doctor[10];
    private int size;

    public void add(Doctor employee){
        if (size == doctors.length){
            extend();
        }
        doctors[size++] = employee;
    }
    private void extend() {
        Doctor[] tmp = new Doctor[doctors.length + 10];
        System.arraycopy(doctors, 0, tmp, 0, doctors.length);
        doctors = tmp;
    }

    public void searchDoctorByProfession(String keyword) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getProfession().contains(keyword)){
                System.out.println(doctors[i].getId() + " " + doctors[i].getName() + " " + doctors[i].getSurname() + " " +
                        doctors[i].getPhone() + " " + doctors[i].getEmail() + " " + " " + doctors[i].getProfession());
            }
        }
    }
    public static void deleteDoctorById(String keyword) {
    }
}
