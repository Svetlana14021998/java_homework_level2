package obstacles;

import participants.Animal;
import participants.Jumpable;
import participants.Participant;
import participants.Runable;

public class Cross extends Obstacle {

    private int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Participant a) {
        if (a instanceof Runable) {
            ((Runable) a).run(length);
        } else {
            System.out.println(a.toString() + " - can't jump");
            a.setOnDistance(false);
        }

    }
}
