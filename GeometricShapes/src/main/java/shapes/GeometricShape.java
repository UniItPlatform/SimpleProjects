package shapes;

/**
 * Created by boutinov on 1/26/14.
 */
abstract public class GeometricShape {

    private float rotation;
    protected float width;
    protected float height;

    public GeometricShape() {
        width = 100;
        height = 100;
        rotation = 0;
    }

    public float getRotation() {
        return rotation;
    }

    public void setRotation(float rotation) {
        this.rotation = rotation % 180;
    }
}
