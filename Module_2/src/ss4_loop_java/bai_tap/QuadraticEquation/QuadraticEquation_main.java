package ss4_loop_java.bai_tap.QuadraticEquation;

import java.util.Scanner;

public class QuadraticEquation_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a: ");
        double a = sc.nextDouble();
        System.out.println("Enter number b: ");
        double b = sc.nextDouble();
        System.out.println("Enter number c: ");
        double c = sc.nextDouble();
//        System.out.println("Your Equation is: " + a+ ;
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDelta() < 0){
            System.out.println("Equation with no solution");
        }else if (quadraticEquation.getDelta() > 0){
            System.out.println("X1 = " + quadraticEquation.getX1());
            System.out.println("X2 = " + quadraticEquation.getX2());
        }else {
            System.out.println("X1 = X2 = " + quadraticEquation.getX());
        }
    }
}
