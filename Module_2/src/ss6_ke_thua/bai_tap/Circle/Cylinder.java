package ss6_ke_thua.bai_tap.Circle;

public class Cylinder extends Circle {
    private double height;
    private double Volume;
    public Cylinder(double Radius, String Color, double height, double Volume) {
        super(Radius, Color);
        this.height= height;
        this.Volume = Volume;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder(" +
                "height=" + height +
                ", Volume=" + Volume +
                ')';
    }
}
