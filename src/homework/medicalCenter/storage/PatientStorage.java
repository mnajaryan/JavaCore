package homework.medicalCenter.storage;

import homework.medicalCenter.Patient;

public class PatientStorage {

    private Patient[] patients= new Patient[10];
    private int size;

    public void add(Patient employee){
        if (size == patients.length){
            extend();
        }
        patients[size++] = employee;
    }
    private void extend() {
        Patient[] tmp = new Patient[patients.length + 10];
        System.arraycopy(patients, 0, tmp, 0, patients.length);
        patients = tmp;
    }
}
