

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.setName("Сивка");
        myCat.setAge(9);

        Owner myOwner = new Owner();
        myOwner.setName("Паха");

        myCat.setOwner(myOwner);
        myCat.greet();
    }
}
