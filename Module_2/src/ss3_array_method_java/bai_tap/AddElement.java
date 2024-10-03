package ss3_array_method_java.bai_tap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1,2,3,4,5,6};
        System.out.println("The origin array: " + Arrays.toString(array));
        System.out.println("Enter the element to be added: ");
        int element = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the index to be added: ");
        int index = Integer.parseInt(sc.nextLine());
        if (index < 0||index > array.length){
            System.out.println("Invalid index");
        }else {
           int[] newArray = new int[array.length + 1];

           for (int i = 0; i < index; i++) {
               newArray[i] = array[i];
           }
            for (int i = index; i < array.length; i++) {
                newArray[i] = array[i - 1];
            }
            System.out.println("The new array: " + Arrays.toString(newArray));
        }

    }
}
