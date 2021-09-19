import obstacles.*;
import participants.*;

public class Main {
    public static void main(String[] args) {
        Obstacle[] obstacles = {
                new Cross(100),
                new Wall(10),
                new Water(15)};

        Participant[] participants = {
                new Cat("Barsik", Color.RED),
                new Dog("Bobik", Color.BLACK),
                new Duck("Scrooge", Color.WHITE),
                new Robot("C3PO",Color.GREY)
        };
        Team team = new Team("team1",participants);

        Course course = new Course(obstacles);
        course.doIt(team);
        team.showResults();

    }
}
