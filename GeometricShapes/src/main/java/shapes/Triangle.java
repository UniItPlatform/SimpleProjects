package shapes;

/**
 * Created by boutinov on 1/26/14.
 */
public class Triangle extends GeometricShape {

    protected static final int numVertices = 3;

    public enum roundTriangleCornerOrientation {
        topleft,
        topright,
        bottomleft,
        bottomright
    }

    private float[] pointsXCoordinates = new float[numVertices];
    private float[] pointsYCoordinates = new float[numVertices];

    public Triangle() {
        // by default it is a round triangle with the round corner in the top left corner
        pointsXCoordinates[0] = 0;
        pointsYCoordinates[0] = 0;
        pointsXCoordinates[1] = width;
        pointsYCoordinates[1] = 0;
        pointsXCoordinates[2] = 0;
        pointsYCoordinates[2] = height;
    }

    public Triangle(float width, float height, roundTriangleCornerOrientation orientation) {
        this.width = width;
        this.height = height;
        switch (orientation) {
            case topleft:
                pointsXCoordinates[0] = 0;
                pointsYCoordinates[0] = 0;
                pointsXCoordinates[1] = width;
                pointsYCoordinates[1] = 0;
                pointsXCoordinates[2] = 0;
                pointsYCoordinates[2] = height;
                break;
            case topright:
                pointsXCoordinates[0] = width;
                pointsYCoordinates[0] = 0;
                pointsXCoordinates[1] = width;
                pointsYCoordinates[1] = height;
                pointsXCoordinates[2] = 0;
                pointsYCoordinates[2] = 0;
                break;
            case bottomleft:
                pointsXCoordinates[0] = 0;
                pointsYCoordinates[0] = height;
                pointsXCoordinates[1] = 0;
                pointsYCoordinates[1] = 0;
                pointsXCoordinates[2] = width;
                pointsYCoordinates[2] = height;
                break;
            case bottomright:
                pointsXCoordinates[0] = width;
                pointsYCoordinates[0] = height;
                pointsXCoordinates[1] = 0;
                pointsYCoordinates[1] = height;
                pointsXCoordinates[2] = width;
                pointsYCoordinates[2] = 0;
                break;
        }
    }

    public Triangle(float x1, float y1, float x2, float y2, float x3, float y3) {
        pointsXCoordinates[0] = x1;
        pointsXCoordinates[1] = x2;
        pointsXCoordinates[2] = x3;
        pointsYCoordinates[0] = y1;
        pointsYCoordinates[1] = y2;
        pointsYCoordinates[2] = y3;
        moveOrigin(-x1, -y1);
        recalculateBoundaries();
    }

    public void moveOrigin(float xOffset, float yOffset) {
        for (int i = 0; i < numVertices; i++) {
            pointsXCoordinates[i] += xOffset;
            pointsYCoordinates[i] += yOffset;
        }
    }

    protected void recalculateBoundaries() {
        float minX, minY, maxX, maxY;
        minX = maxX = pointsXCoordinates[0];
        minY = maxY = pointsYCoordinates[0];
        for (int i = 1; i < numVertices; i++) {
            if (pointsXCoordinates[i] < minX) {
                minX = pointsXCoordinates[i];
            }
            if (pointsXCoordinates[i] > maxX) {
                maxX = pointsXCoordinates[i];
            }
            if (pointsYCoordinates[i] < minY) {
                minY = pointsXCoordinates[i];
            }
            if (pointsYCoordinates[i] > maxY) {
                maxY = pointsYCoordinates[i];
            }
        }
        this.width = maxX - minX;
        this.height = maxY - minY;
    }

    @Override
    public String toString() {
        String str = super.toString();
        str += " points=[";
        for (int i = 0; i < numVertices; i++) {
            str += "(" + pointsXCoordinates[i] + ", " + pointsYCoordinates[i] + ")";
            if (i + 1 < numVertices) {
                str += ", ";
            }
        }
        str += "]";
        return str;
    }
}
