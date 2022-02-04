public class EmployeeTest {
    public static void main(String[] args) {

        //Print all emails- One employee has one email- One to One
        EmployeeData.readlAll()
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        //Print all phone numbers
       EmployeeData.readlAll()
               .map(Employee::getEmpPhoneNumbers)
               .forEach(System.out::println);
    }
}
