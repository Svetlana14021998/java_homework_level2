public class Main {

    static final int size = 10000000;
    static final int h = size / 2;

    public static void main(String[] args) {


        float[] arr1 = new float[h];
        float[] arr2 = new float[h];
        float[] arr = new float[size];


        arr = putArr(arr);
        method1(arr);
        arr = putArr(arr);
        method2(arr, arr1, arr2);

    }


    public static float[] putArr(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        return arr;
    }

    public static void method1(float[] arr) {//измерение времени при прохождении массива длинной size
        // и замены каждого его элемента на значение вычисляемого выражения
        long timer = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Время выполнения метода 1:  " + (System.currentTimeMillis() - timer));
    }


    public static void method2(float[] arr, float[] arr1, float[] arr2) {//измерение времени:  разделение массива на 2,
        // проходжение каждого из массивов в режиме работы 2 потоков, замена всех элементов на значение вычисляемого выражения и склейка массовов
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < arr1.length; i++) {
                    arr1[i] = (float) (arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < arr2.length; i++) {
                    arr2[i] = (float) (arr2[i] * Math.sin(0.2f + (i + h) / 5) * Math.cos(0.2f + (i + h) / 5) * Math.cos(0.4f + (i + h) / 2));
                }
            }
        });


        long t = System.currentTimeMillis();
        System.arraycopy(arr, 0, arr1, 0, h);
        System.arraycopy(arr, h, arr2, 0, h);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        System.arraycopy(arr1, 0, arr, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);
        System.out.println("Время выполнения метода 2: " + (System.currentTimeMillis() - t));
    }


}
