package lab8.abssuperclassanimal;

public class Main {
    public static void main(String[] args) {
        //Downcasting
        Animal cat = new Cat("cat");
        cat.greets();

        //Upcasting
        Dog animal1 = new Dog("Dog");
        Animal dog = animal1;
        dog.greets();

        Dog bigdog = new BigDog("BigDog");
        bigdog.greets();
        BigDog another = new BigDog("BigDog");
        bigdog.greets(another);
    }
}
