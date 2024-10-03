package ss4_loop_java.bai_tap.QuadraticEquation;

public class QuadraticEquation {
   double a, b, c;
   public QuadraticEquation(double a, double b, double c){
       this.a = a;
       this.b = b;
       this.c = c;
   }
   public double getDelta(){
       return Math.pow(b,2) - 4 * a * c;
   }
   public double getX1(){
       return (-b + Math.sqrt(getDelta()))/ (2 * a);
   }
   public double getX2(){
       return (-b - Math.sqrt(getDelta()))/ (2 * a);
   }
   public double getX (){
       return (-b)/2 * a;
   }
}
