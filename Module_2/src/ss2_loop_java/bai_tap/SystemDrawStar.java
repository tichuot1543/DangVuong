package ss2_loop_java.bai_tap;

public class SystemDrawStar {
   public static void main(String[] args) {
       System.out.println("Draw Rectangle");
       for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 6; j++) {
               System.out.print("*" + " ");
           }
           System.out.println();
       }
       System.out.println(" ");
       System.out.println("Draw Triangle");
       for (int i = 0; i < 5; i++) {
           for (int j = 0; j < i + 1; j++) {
               System.out.print("*" + " ");
           }
           System.out.println();
       }
       System.out.println();
       System.out.println("Draw Return Triangle");
       for (int i = 0; i < 5; i++) {
           for (int j = 0; j < 5 - i; j++) {
               System.out.print("*" + " ");
           }
           System.out.println();
       }
   }

   }