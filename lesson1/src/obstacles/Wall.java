package obstacles;

import participants.Animal;
import participants.Jumpable;
import participants.Participant;

public class Wall extends Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Participant a) {
        if (a instanceof Jumpable) {
            ((Jumpable) a).jump(height);
        } else {
            System.out.println(a.toString() + " - can't jump");
            a.setOnDistance(false);
        }

    }
}
