package ss4_loop_java.thuc_hanh.Rectangle;

public class Rectangle {
    double height, width;
    public Rectangle( double height, double width){
        this.height = height;
        this.width = width;
    }
    public double getArea(){
        return height * width;
    }
    public double getPerimeter(){
        return (height + width)*2;
    }
    public String display(){
        return "Height: " + height + " " + "Width: " + width;
    }
}
