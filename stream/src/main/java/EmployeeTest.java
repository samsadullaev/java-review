import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {

        //Print all emails- One employee has one email- One to One
        EmployeeData.readlAll()
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        //Print all phone numbers
        System.out.println("************************");
       EmployeeData.readlAll()
               .map(Employee::getEmpPhoneNumbers)
               .forEach(System.out::println);

        System.out.println("************************");
       EmployeeData.readlAll()
               .flatMap(employee -> employee.getEmpPhoneNumbers().stream())
               .forEach(System.out::println);

        System.out.println("************************");
        EmployeeData.readlAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);

    }
}
