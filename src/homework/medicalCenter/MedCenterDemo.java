package homework.medicalCenter;

import homework.medicalCenter.storage.DoctorStorage;
import homework.medicalCenter.storage.PatientStorage;

import java.util.Scanner;

import static homework.medicalCenter.storage.DoctorStorage.deleteDoctorById;

public class MedCenterDemo {

    private static Scanner scanner = new Scanner(System.in);
    private static PatientStorage patientStorage = new PatientStorage();
    private static DoctorStorage doctorStorage = new DoctorStorage();

    public static void main(String[] args) {

        boolean isRun = true;
        while (isRun){
           printCommands();
            switch (scanner.nextLine()){
                case "0":
                    isRun = false;
                    break;
                case "1":
                    adddoctor();
                    break;
                case "2":
                    System.out.println("Please input Profession \\n 1 - ատամնաբույժ\\n 2 - հոգեբան\\n 3 - ակնաբույժ\\n 4 - մաշկաբան\"");
                    String keyword = scanner.nextLine();
                    doctorStorage.searchDoctorByProfession(keyword);
                    break;
                case "3":
                    System.out.println("Please input doctorId");
                    String keyword1 = scanner.nextLine();
                    doctorStorage.deleteDoctorById(keyword1);
                    break;
                case "4":
//                    changeDoctorById ();
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7":
                    break;
                default:
                    System.out.println("invalid command. Try again!!!");
            }
        }
    }


    private static void printCommands(){
        System.out.println("Please input 0 - exit");
        System.out.println("Please input 1 - add doctor");
        System.out.println("Please input 2 - search doctor by profession");
        System.out.println("Please input 3 - delete doctor by id");
        System.out.println("Please input 4 - change doctor by id");
        System.out.println("Please input 5 - add patient");
        System.out.println("Please input 6 - print all  patients by doctor");
        System.out.println("Please input 7 - print all patients");
    }

    private static void adddoctor() {
        System.out.println("Please input Id");
        String doctorId = scanner.nextLine();
        System.out.println("Please input name");
        String doctorName = scanner.nextLine();
        System.out.println("Please input surname");
        String doctorSurname = scanner.nextLine();
        System.out.println("Please input email");
        String doctorEmail = scanner.nextLine();
        System.out.println("Please input phone");
        String doctorPhone = scanner.nextLine();
        System.out.println("Please choose a profession \n 1 - ատամնաբույժ\n 2 - հոգեբան\n 3 - ակնաբույժ\n 4 - մաշկաբան");
        String scannerChoose = scanner.nextLine();
        String doctorProfession;
        if (scannerChoose.equals("1")){
            doctorProfession = "ատամնաբույժ";
        }else if (scannerChoose.equals("2")) {
            doctorProfession = "հոգեբան";
        }else if (scannerChoose.equals("3")) {
            doctorProfession = "ակնաբույժ";
        }else if (scannerChoose.equals("4")) {
            doctorProfession = "մաշկաբան";
        }else {
            doctorProfession = "անհայտ";
        }
        Doctor doctor = new Doctor(doctorId, doctorName, doctorSurname, doctorEmail, doctorPhone, doctorProfession);
        doctorStorage.add(doctor);
        System.out.println("done!!");
    }




//    0 - exit
//1 - add doctor ստուգել իդի ով
//2 - search doctor by profession // yntrel masnagitutyuny
//3 - delete doctor by id
//4 - change doctor  by id (բացի իդ-ից ամեն ինչ կարողանալու ենք փոխել)
//5 - add patient(ընտրելու եք բժշկին, հետո հիվանդի տվյալները)
//6 - print all  patients by doctor
//7 - print all patients
}
