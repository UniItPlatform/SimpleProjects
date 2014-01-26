package shapes;

/**
 * Created by boutinov on 1/26/14.
 */
abstract public class GeometricShape {

    private float rotation;
    protected float width;
    protected float height;

    public GeometricShape() {
        width = 0;
        height = 0;
        rotation = 0;
    }

    public float getRotation() {
        return rotation;
    }

    public void setRotation(float rotation) {
        this.rotation = rotation % 180;
    }
}
