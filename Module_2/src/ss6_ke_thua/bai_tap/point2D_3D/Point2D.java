package ss6_ke_thua.bai_tap.point2D_3D;

public class Point2D {
    protected float x;
    protected float y;
    public Point2D(){
    }
    public Point2D (float x, float Y){
        this.x= x;
        this.y = Y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        return new float[] {x,y};
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
