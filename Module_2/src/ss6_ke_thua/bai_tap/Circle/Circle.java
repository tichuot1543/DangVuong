package ss6_ke_thua.bai_tap.Circle;

public class Circle {
    private double Radius;
    private String Color;
    public Circle(double Radius, String Color){
        this.Radius = Radius;
        this.Color = Color;
    }

    private double getRadius() {
        return Radius;
    }

    private String getColor() {
        return Color;
    }
    public double getArea(){
        return Math.pow(Radius,2) * Math.PI;
    }

    public void setRadius(int radius) {
        this.Radius = radius;
    }

    public void setColor(String color) {
        this.Color = color;
    }

}
