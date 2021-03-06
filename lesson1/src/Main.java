import obstacles.Cross;
import obstacles.Obstacle;
import obstacles.Wall;
import obstacles.Water;
import participants.*;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Cat("Barsik", Color.RED), new Dog("Bobik", Color.BLACK), new Duck("Scrooge", Color.WHITE)};
        Obstacle[] obstacles = {new Cross(100), new Wall(10), new Water(15)};

        for (Animal a : animals) {
            for (Obstacle o : obstacles) {
                o.doIt(a);
                if (!a.isOnDistance()) {
                    break;
                }
            }
        }
        System.out.println("RESULTS:");
        for (Animal p : animals) {
            p.info();
        }
    }
}
