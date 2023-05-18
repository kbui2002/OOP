package lab7.superclassanimal;

public class Animal {
    private String name;
    public Animal(String name) {
        setName(name);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        return "Animal[name=" + name + "]";
    }
}
