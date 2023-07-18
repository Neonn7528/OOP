
public class Cat {
    private String name;
    private int age;
    private Owner owner;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public void greet() {
        String ownerName = owner != null ? owner.getName() : "неизвестно";
        System.out.println("Мяу! Меня зовут " + name + ". Мне " + age + " лет. Мой владелец - " + ownerName + ".");
    }
}