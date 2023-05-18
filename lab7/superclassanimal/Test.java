package lab7.superclassanimal;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal("animal");
        System.out.println(animal);
        Mammal mammal = new Mammal("mammal");
        System.out.println(mammal);
        Cat cat = new Cat("cat");
        System.out.println(cat);
        Dog dog = new Dog("dog");
        Dog another = new Dog("another dog");
        System.out.println(dog);
        dog.greets();
        dog.greets(another);
    }
}
