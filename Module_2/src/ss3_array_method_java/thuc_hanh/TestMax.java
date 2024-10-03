package ss3_array_method_java.thuc_hanh;

import java.util.Scanner;

public class TestMax {
    public static int max(int num1, int num2) {
        int result;
        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }
        return result;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1th: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the number 2th: ");
        int num2 = sc.nextInt();
        System.out.println("The max number is: " + max(num1, num2));
    }
    }
