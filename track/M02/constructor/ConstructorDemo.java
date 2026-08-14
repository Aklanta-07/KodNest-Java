package constructor;

public class ConstructorDemo {

    String name;
    int age;
    int height;

    public ConstructorDemo() {
        this.name = "John Doe";
        this.age = 20;
        this.height = 170;
    }

    //parameterised constructor
    public ConstructorDemo(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public static void main(String[] args) {
        ConstructorDemo demo = new ConstructorDemo();
        ConstructorDemo demo2 = new ConstructorDemo("Jane Doe", 25, 165);
    }
    }
