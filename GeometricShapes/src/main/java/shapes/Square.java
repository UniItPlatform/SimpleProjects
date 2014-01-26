package shapes;

/**
 * Created by boutinov on 1/26/14.
 */
public class Square extends Rectangle {
    public Square() {
    }

    public Square(float side) {
        super(side, side);
    }

    public void setWidth(float width) {
        this.width = width;
        this.height = width;
    }

     public void setHeight(float height) {
         this.width = height;
         this.height = height;
     }
}
