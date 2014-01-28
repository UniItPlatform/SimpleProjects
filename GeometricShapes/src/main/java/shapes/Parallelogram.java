package shapes;

/**
 * Created by boutinov on 1/27/14.
 */
public class Parallelogram extends Rectangle {

    protected float angle;

    public Parallelogram() {
        angle = 15; // default angle
    }

    public Parallelogram(float width, float height, float angle) {
        super(width, height);
        this.angle = angle;
    }

    public float getAngle() {
        return angle;
    }

    public void setAngle(float angle) {
        this.angle = angle;
    }

    @Override
    public String toString() {
        String str = super.toString();
        str += " angle=" + angle;
        return str;
    }
}
