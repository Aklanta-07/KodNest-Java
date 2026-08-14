package constructor;

public class StudentDemo {
    String name;
    int age;
    int height;

    public void input(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
    }

}
