package lab8.abssuperclassanimal;

public class BigDog extends Dog {
    public BigDog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Woow");
    }

    public void greets(Dog another) {
        System.out.println("Woooooooow");
    }

    public void greets(BigDog another) {
        System.out.println("Woooooooooow");
    }
}
