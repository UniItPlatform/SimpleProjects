package shapes;

/**
 * Created by boutinov on 1/26/14.
 */
abstract public class GeometricShape {

    private final float DEFAULT_WIDTH = 100f;
    private final float DEFAULT_HEIGHT = 100f;
    private final float DEFAULT_ROTATION = 0f;
    private final float ROTATION_BOUND = 180f;

    private float rotation; // -180ª ≤ angle ≤ 180ª
    protected float width;
    protected float height;

    public GeometricShape() {
        width = DEFAULT_WIDTH;
        height = DEFAULT_HEIGHT;
        rotation = DEFAULT_ROTATION;
    }

    public float getRotation() {
        return rotation;
    }

    public void setRotation(float rotation) {
        rotation %= ROTATION_BOUND * 2;
        this.rotation = rotation > ROTATION_BOUND ? -rotation  + ROTATION_BOUND : rotation < -1 * ROTATION_BOUND ? -rotation -1 * ROTATION_BOUND : rotation;
    }

    @Override
    public String toString() {
        String str = this.getClass().getSimpleName() + ":";
        str += " width=" + width + " height=" + height + " rotation=" + rotation;
        return str;
    }

}
