package homework.employee;

import exampleOfBook.scanner.Book;

public class EmployeeStorage {
    private Employee[] employees= new Employee[10];
    private int size;

    public void add(Employee employee){
        if (size == employees.length){
            extend();
        }
        employees[size++] = employee;
    }

    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i].getName() + " " + employees[i].getSurname() + " " +
                    employees[i].getEmplyeeID() + " " + employees[i].getSalary() + " " +
                    employees[i].getCompany() + " " + employees[i].getPosition());
        }
    }

    public void searchByEmployeeID(String keyword){
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmplyeeID().contains(keyword)){
                System.out.println(employees[i].getName() + " " + employees[i].getSurname() + " " +
                        employees[i].getEmplyeeID() + " " + employees[i].getSalary() + " " +
                        employees[i].getCompany() + " " + employees[i].getPosition());
            }
        }
    }


    public void searchByCompanyName(String keyword){
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().contains(keyword)){
                System.out.println(employees[i].getName() + " " + employees[i].getSurname() + " " +
                        employees[i].getEmplyeeID() + " " + employees[i].getSalary() + " " +
                        employees[i].getCompany() + " " + employees[i].getPosition());
            }
        }
    }

    private void extend() {
        Employee[] tmp = new Employee[employees.length + 10];
        System.arraycopy(employees, 0, tmp, 0, employees.length);
        employees = tmp;
    }


}
