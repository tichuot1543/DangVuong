package ss3_array_method_java.bai_tap;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]array = {1,2,3,4,5};
        System.out.println(Arrays.toString(array));
        System.out.print("Enter the element in array you want to delete: ");
        int Element = Integer.parseInt(sc.nextLine());
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == Element) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Element not found!!!");
        }else {
            int[] newArray = new int[array.length-1];
            for (int i = 0; i < index; i++) {
                newArray[i] = array[i];
            }
            for (int i = index; i < array.length - 1; i++) {
                newArray[i] = array[i+1];
            }
            System.out.println("Array after deleted element: " + Arrays.toString(newArray));
        }
    }
}
