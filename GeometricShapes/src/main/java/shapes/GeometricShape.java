package shapes;

/**
 * Created by boutinov on 1/26/14.
 */
abstract public class GeometricShape {

    private float rotation; // -180ª ≤ angle ≤ 180ª
    protected float width;
    protected float height;

    public GeometricShape() {
        width = 100; // default value
        height = 100; // default value
        rotation = 0; // default value
    }

    public float getRotation() {
        return rotation;
    }

    public void setRotation(float rotation) {
        rotation %= 360;
        this.rotation = rotation > 180 ? -rotation  + 180 : rotation < -180 ? -rotation - 180 : rotation;
    }
}
