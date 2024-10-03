package ss2_loop_java.bai_tap;

import java.util.Scanner;

public class DisplayPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of numbers to display: ");
        int numbers = sc.nextInt();
        int primeNumber = 0;
        int N = 2;
        while (primeNumber < numbers) {
            int count = 0;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    count++;
                    break;
                }
            }
                if (count == 0) {
                    primeNumber++;
                    System.out.println("The prime number is: " + N + " ");
                }
                N++;
            }
        }

        }


