package shapes;

/**
 * Created by boutinov on 1/27/14.
 */
public class Trapezium extends Rectangle {

    private final float DEFAULT_TOPSIDE_SIZE_MULTIPLIER = 0.5f;

    protected float smallerSideWidth;

    public Trapezium() {
        smallerSideWidth = width * DEFAULT_TOPSIDE_SIZE_MULTIPLIER;
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

    @Override
    public String toString() {
        String str = super.toString();
        str += " smallerSideWidth=" + smallerSideWidth;
        return str;
    }

}
