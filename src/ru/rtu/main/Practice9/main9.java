package ru.rtu.main.Practice9;


import ru.rtu.main.Practice3.Hand;

public class main9 {
    public static void main(String[] args) {
        Company company = new Company();
        company.doThings(new HandleImployees() {
            @Override
            public void doEverything(Employee employee) {
                System.out.println(employee.getBirthDate());
            }
        });
        company.doThings(employee -> employee.setPhoneNumber(89682322353L));
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

