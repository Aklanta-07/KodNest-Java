import java.util.Scanner;

class Student {
    int registrationId;
    String name;
    double attendancePercentage;
}

public class StudentRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student stud1 = createStudent(scanner);
        Student stud2 = createStudent(scanner);

        int selectedId = scanner.nextInt();
        double newAttendance = scanner.nextDouble();

        Student selectedStudent = null;

        if (stud1.registrationId == selectedId) {
            selectedStudent = stud1;
        } else if (stud2.registrationId == selectedId) {
            selectedStudent = stud2;
        }

        if (selectedStudent != null) {
            selectedStudent.attendancePercentage = newAttendance;
            System.out.println("Selected Student: " + selectedStudent.name);
        } else {
            System.out.println("Student not found.");
        }

        print(stud1);
        print(stud2);
    }

    private static Student createStudent(Scanner scanner) {
        Student student = new Student();
        student.registrationId = scanner.nextInt();
        student.name = scanner.next();
        student.attendancePercentage = scanner.nextDouble();
        return student;
    }

    private static void print(Student student) {
        System.out.println(student.registrationId + " - " + student.name + " - " + student.attendancePercentage + "%");
    }
}