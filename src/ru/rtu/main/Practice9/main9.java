package ru.rtu.main.Practice9;


import java.time.LocalDate;

public class main9 {
    public static void main(String[] args) {
        LocalDate empBirthData = LocalDate.of(2000,11,3);
        Company company = new Company();
        company.doThings(new HandleImployees() {
            @Override
            public void doEverything(Employee employee) {
                System.out.println(employee.getBirthDate());
            }
        });
        company.doThings(employee -> employee.setPhoneNumber(89682322353L));
        company.hire(new Employee("Vanya", "Danilov", empBirthData , "Street", 892352523523L, 30000));
        letsDoSomeThings handle = new letsDoSomeThings();
        company.doThings(handle);
    }
}

class letsDoSomeThings implements HandleImployees {
    @Override
    public void doEverything(Employee employee) {
         employee.setName("Ivan");
    }
}

