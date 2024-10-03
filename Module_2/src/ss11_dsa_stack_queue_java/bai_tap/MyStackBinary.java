package ss11_dsa_stack_queue_java.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class MyStackBinary {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Decimal number");
        int number = Integer.parseInt(scanner.nextLine());
        int total;
        while (number > 0) {
            total = number % 2;
            stack.push(total);
            number = number / 2;
        }
        System.out.println("The Binary number is: ");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
