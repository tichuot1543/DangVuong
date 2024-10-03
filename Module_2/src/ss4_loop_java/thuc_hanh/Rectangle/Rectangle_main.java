package ss4_loop_java.thuc_hanh.Rectangle;

import java.util.Scanner;

public class Rectangle_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height: ");
        double height = sc.nextDouble();
        System.out.println("Enter the width: ");
        double width = sc.nextDouble();
        Rectangle rectangle = new Rectangle(height, width);
        System.out.println(rectangle.display());
        System.out.println("The Area of Rectangle: " + rectangle.getArea());
        System.out.println("The Perimeter of Rectangle: " + rectangle.getPerimeter());
    }
}
