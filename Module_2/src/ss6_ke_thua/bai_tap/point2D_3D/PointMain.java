package ss6_ke_thua.bai_tap.point2D_3D;

import java.util.Arrays;

public class PointMain {
    public static void main(String[] args) {
    Point2D point2D = new Point2D(3,5);
        System.out.println("Point2D: " + point2D);
        point2D.setXY(4,6);
        System.out.println("Updated Point2D: " + point2D);
        System.out.println("Coordinates of Point2D: " + Arrays.toString(point2D.getXY()));
        Point3D point3d = new Point3D(1, 2, 3);
        System.out.println("Point3D: " + point3d);
        point3d.setXYZ(7, 8, 9);
        System.out.println("Updated Point3D: " + point3d);
        System.out.println("Coordinates of Point3D: " + Arrays.toString(point3d.getXYZ()));
    }
}
