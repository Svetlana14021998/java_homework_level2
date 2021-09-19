package participants;

public class Team {
    String commandName;

    private final Participant[] participant;

    public Team(String commandName, Participant... participants) {
        this.commandName = commandName;
        this.participant = participants;
    }

    public void showResults() {
        System.out.println("The team: " + commandName);
        for (Participant p : getParticipant()) {
            System.out.println(p + ": " + p.isOnDistance());
        }
    }

    public Participant[] getParticipant() {
        return participant;
    }
}
