package shapes;

/**
 * Created by boutinov on 1/26/14.
 */
public class Polygon extends Rectangle {

    private final int DEFAULT_NUM_OF_SIDES = 5; // pentagon

    protected int numberOfSides;

    public Polygon() {
        numberOfSides = DEFAULT_NUM_OF_SIDES;
    }

    public Polygon(float width, float height, int numberOfSides) {
        super(width, height);
        this.numberOfSides = numberOfSides;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    @Override
    public String toString() {
        String str = super.toString();
        str += " numberOfSides=" + numberOfSides;
        return str;
    }
}
