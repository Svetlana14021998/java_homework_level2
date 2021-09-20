

public class MyException extends Throwable {
    private int a;
    private int b;

    MyException(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a + 1;
    }

    public int getB() {
        return b + 1;
    }

    public void printMsg() {
        System.out.println("Arrays data uncorrected in element: [" + getA() + " ; " + getB()+"]");
    }
}
