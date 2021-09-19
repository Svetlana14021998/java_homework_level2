package participants;

public abstract class Animal implements Participant {
    String type;
    String name;
    Color color;

    int maxRunDistance;
    int maxJumpHeight;

    boolean onDistance;

    public boolean isOnDistance() {
        return onDistance;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public void setOnDistance(boolean onDistance) {
        this.onDistance = onDistance;
    }

    public Animal(String type, String name, Color color, int maxRunDistance, int maxJumpHeight) {
        this.type = type;
        this.name = name;
        this.color = color;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = true;
    }

    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(this.toString() + " - Run OK");
        } else {
            System.out.println(this.toString() + " - Run FAILED");
            onDistance = false;
        }
    }

    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(this.toString() + " - Jump OK");
        } else {
            System.out.println(this.toString() + " - Jump FAILED");
            onDistance = false;
        }
    }

    public void info() {
        System.out.println(this.toString() + onDistance);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", color=" + color +
                '}';
    }
}