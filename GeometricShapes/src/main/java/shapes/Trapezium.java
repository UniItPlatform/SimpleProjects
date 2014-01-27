package shapes;

/**
 * Created by boutinov on 1/27/14.
 */
public class Trapezium extends Rectangle {

    protected float smallerSideWidth;

    public Trapezium() {
        smallerSideWidth = width / 2;
    }

    public Trapezium(float width, float height, float smallerSideWidth) {
        super(width, height);
        this.smallerSideWidth = smallerSideWidth;
    }

    public float getSmallerSideWidth() {
        return smallerSideWidth;
    }

    public void setSmallerSideWidth(float smallerSideWidth) {
        this.smallerSideWidth = smallerSideWidth;
    }
}
