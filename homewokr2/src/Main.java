import java.util.Scanner;

public class Main {
    private static final int ARRAY_SIZE = 4;
    public static void main(String[] args) {

        try {
            System.out.println("Sum is: " + sum(ARRAY_SIZE));
        } catch (MyException e) {
            e.printMsg();
        } catch (MyArraySizeException e1) {
            e1.printMsg();
        }

    }

    public static int sum(int size) throws MyException, MyArraySizeException {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input length of array");
        int n = scanner.nextInt();
        System.out.println("Input weight of array");
        int m = scanner.nextInt();
        if (n != size || m != size) {
            throw new MyArraySizeException();
        }
        String[][] array = new String[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("Input element of array " +"["+ (i + 1) + " ; " + (j + 1)+"]");
                array[i][j] = scanner.next();
            }
        }

        int a[][] = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (!check(array[i][j])) {
                    throw new MyException(i, j);
                } else {
                    a[i][j] = Integer.parseInt(array[i][j]);
                    sum += a[i][j];

                }
            }

        }
        return sum;

    }

    public static boolean check(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }


}

