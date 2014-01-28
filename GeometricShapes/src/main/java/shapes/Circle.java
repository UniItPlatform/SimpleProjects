package shapes;

/**
 * Created by boutinov on 1/26/14.
 */
public class Circle extends GeometricShape {

    public Circle() {
    }

    public Circle(float radius) {
        this.width = radius * 2;
        this.height = radius * 2;
    }

    public float getRadius() {
        return width / 2;
    }

    public void setRadius(float radius) {
        this.width = radius * 2;
        this.height = radius * 2;
    }

    @Override
    public String toString() {
        String str = super.toString();
        str += " radius=" + getRadius();
        return str;
    }
}
