package participants;

public class Robot implements Runable, Jumpable, Swimable, Participant {
    private final String type = "Robot";
    private String name;
    private Color color;
    private boolean onDistance;
    private int maxJumpDistance = TYPICAL_JUMP_DISTANCE * 3;
    private int maxRunDistance = TYPICAL_RUN_DISTANCE * 20;
    private int maxSwimDistance = TYPICAL_SWIM_DISTANCE * 2;

    public Robot(String name, Color color) {
        this.name = name;
        this.color = color;
        onDistance = true;
    }

    public String getType() {
        return type;
    }

    public Color getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpDistance) {
            System.out.println(this.toString() + "  - Jump OK");
        } else {
            System.out.println(this.toString() + "  - Jump FAILED");
            onDistance = false;
        }

    }

    @Override
    public void setOnDistance(boolean onDistance) {
        this.onDistance = onDistance;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(this.toString() + "  - Run OK");
        } else {
            System.out.println(this.toString() + "  - Run FAILED");
            onDistance = false;
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= maxJumpDistance) {
            System.out.println(this.toString() + "  - Swim OK");
        } else {
            System.out.println(this.toString() + "  - Swim FAILED");
            onDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", color=" + color +
                '}';
    }
}
