package ss5_access_modifier_static.bai_tap;

public class Circle {
    private double radius;
    private String color;
    public Circle (){
        this.radius = 1;
        this.color = "red";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle(" +
                "Radius = " + radius +
                ", Area = " + getArea() +
                ")";
    }
}

