public class Person {

    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void talk() {
        System.out.println("Hello my name is %s".formatted(name));
    }


    public static void response() {
        System.out.println("Bro");

    }
}
