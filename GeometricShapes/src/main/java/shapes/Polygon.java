package shapes;

/**
 * Created by boutinov on 1/26/14.
 */
public class Polygon extends Rectangle {

    protected int numberOfSides;

    public Polygon() {
        numberOfSides = 6;
    }

    public Polygon(int numberOfSides) {
        this.numberOfSides = numberOfSides;
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
}
