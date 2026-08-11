public class RefernceChahge {
    public static void main(String[] args) {
        Course course = new Course();
        course.name = "Java";
        course.id = 1;
        Course course2 = course;
        course2.name = "Python";
        course.printMgs();
        course2.printMgs();
    }
}

class Course{
    String name;
    int id;

    public void printMgs() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
    }
}
