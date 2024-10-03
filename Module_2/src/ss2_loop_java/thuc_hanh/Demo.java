package ss2_loop_java.thuc_hanh;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the length of the array");
        int length = sc.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter the " + i + "th element");
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < length; i++) {
            System.out.println(numbers[i]);

    }
}
    }
