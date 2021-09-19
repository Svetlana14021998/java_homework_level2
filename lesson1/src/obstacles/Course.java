package obstacles;


import participants.Participant;
import participants.Team;

public class Course {
    Obstacle[] obstacle;

    public Course(Obstacle... obstacle) {
        this.obstacle = obstacle;
    }

    public void doIt(Team team){
        for (Participant p:team.getParticipant()) {
            for (Obstacle o:obstacle) {
                o.doIt(p);
                if (!p.isOnDistance()){
                    break;
                }
            }

        }


        }


    }

