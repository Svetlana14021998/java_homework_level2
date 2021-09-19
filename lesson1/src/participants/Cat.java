package participants;

public class Cat extends Animal implements Runable,Jumpable{
    public Cat(String name, Color color) {
        super("Cat", name, color,500, 100);
    }
}
