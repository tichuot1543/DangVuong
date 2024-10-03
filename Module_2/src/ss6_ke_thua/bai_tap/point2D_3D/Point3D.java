package ss6_ke_thua.bai_tap.point2D_3D;

public class Point3D extends Point2D{
    private float z;
    public Point3D(){
        super();
    }
    public Point3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ(){
        return new float[] {getX(), getY(), z};
    }
    public void setXYZ(float x, float y, float z){
       super.setXY(x,y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z ;
    }
}
