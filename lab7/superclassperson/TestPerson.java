package lab7.superclassperson;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("Nguyen Van A", "Ha noi");
        System.out.println("Person: " + person.toString());
        Student student = new Student("Tran Thi B", "Thanh Hoa", "MTKHTT", 2020, 15000.0);
        System.out.println("Student: " + student.toString());
        Staff staff = new Staff("Dang Van C", "Quang Ninh", "KHTT", 5000.0);
        System.out.println("Staff: " + staff.toString());
    }
}
