package lab8.abssuperclassanimal;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Meow");
    }
}
