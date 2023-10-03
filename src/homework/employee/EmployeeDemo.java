package homework.employee;

import homework.Sort;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage employeeStorage = new EmployeeStorage();

        boolean isRan = true;
        while (isRan){
            System.out.println("Please input 0 for exit");
            System.out.println("Please input 1 add employee");
            System.out.println("Please input 2 print all employee");
            System.out.println("Please input 3 search employee by employee ID");
            System.out.println("Please input 4 search employee by company name");
            switch (scanner.nextLine()){
                case "0":
                    isRan = false;
                    break;
                case "1":
                    System.out.println("Please input your name");
                    String name = scanner.nextLine();
                    System.out.println("Please input your surname");
                    String surname = scanner.nextLine();
                    System.out.println("Please input your emplyeeID");
                    String emplyeeID = scanner.nextLine();
                    System.out.println("Please input your salary");
                    int salary = Integer.parseInt(scanner.nextLine());
                    System.out.println("Please input your company");
                    String company = scanner.nextLine();
                    System.out.println("Please input your position");
                    String position = scanner.nextLine();
                    Employee employee = new Employee(name, surname, emplyeeID, salary, company, position);
                    employeeStorage.add(employee);
                    System.out.println("Done");
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    System.out.println("Please input emplyeeID");
                    String idSearch = scanner.nextLine();
                    employeeStorage.searchByEmployeeID(idSearch);
                    break;
                case "4":
                    System.out.println("Please input company name");
                    String positionSearch = scanner.nextLine();
                    employeeStorage.searchByCompanyName(positionSearch);
                    break;
                default:
                    System.out.println("Try again!!!");
            }

        }


    }
}
