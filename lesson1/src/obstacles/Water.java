package obstacles;


import participants.Animal;
import participants.Participant;
import participants.Swimable;


public class Water extends Obstacle {
    private int length;

    public Water(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Participant a) {
        if (a instanceof Swimable) {
            ((Swimable) a).swim(length);
        } else {
            System.out.println(a.toString() + " - can't swim");
            a.setOnDistance(false);
        }

    }
}
