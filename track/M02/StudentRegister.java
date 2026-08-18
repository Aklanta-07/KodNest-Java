import java.util.Scanner;

public class StudentRegister {
    int registrationId;
    String name;
    double attendancePercentage;
}

 class StudentRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StudentRegister stud1 = createStudent(scanner);
        StudentRegister stud2 = createStudent(scanner);

        int selectedId = scanner.nextInt();
        double newAttendance = scanner.nextDouble();

        StudentRegister selectedStudent = null;

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

    private static StudentRegister createStudent(Scanner scanner) {
        StudentRegister student = new StudentRegister();
        student.registrationId = scanner.nextInt();
        student.name = scanner.next();
        student.attendancePercentage = scanner.nextDouble();
        return student;
    }

    private static void print(StudentRegister student) {
        System.out.println(student.registrationId + " - " + student.name + " - " + student.attendancePercentage + "%");
    }
}