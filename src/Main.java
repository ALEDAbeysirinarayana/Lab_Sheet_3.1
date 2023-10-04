public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.setName("Alice");
        student1.setAge(20);
        student1.setGrade('A');

        System.out.println("Student Info:");
        student1.displayInfo();
    }
}
