import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) +100_000;
        }
        return arr;
    }
    public static void task1(){
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int total = 0;
        for (int i = 0; i < generateRandomArray().length; i++) {
            total += generateRandomArray()[i];
        }
        System.out.println("сумма трат за месяц составили " + total + " рублей");

    }
    public static void task2(){
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int maxWeith = -1;
        int minWeith = 200_001;
        for (int i = 0; i < generateRandomArray().length; i++) {
            if (generateRandomArray()[i] > maxWeith) {
                maxWeith = generateRandomArray()[i];
            }
        }
        for (int i = 0; i < generateRandomArray().length; i++) {
            if (generateRandomArray()[i] < minWeith) {
                minWeith = generateRandomArray()[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составили " + minWeith + " рублей. Максимальная сумма трат за день составила " + maxWeith + " рублей");
    }
    public static void task3(){
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        int total = 0;
        int day = 30;
        float averageSumma = 0;
        for (int i = 0; i < generateRandomArray().length; i++) {
            total += generateRandomArray()[i];
        }
        averageSumma = total / day;
        System.out.println("Средняя сумма трат за месяц составила " + averageSumma + " рублей");

    }
    public static void task4(){
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
            if (i == ' '){
                System.out.print(" ");
            }
        }
    }

}