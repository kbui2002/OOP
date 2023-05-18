package lab8.abssuperclassanimal;

public abstract class Animal {
    String name;
    public Animal(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public abstract void greets();
}
