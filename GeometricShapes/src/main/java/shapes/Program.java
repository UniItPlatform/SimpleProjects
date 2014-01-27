package shapes;

/**
 * Created by boutinov on 1/27/14.
 */
public class Program {
    public static void main(String args[]) {
        String name = "Triangle";
        GeometricShape gs = ShapeInitializer.getShape(name);
        System.out.println(gs.toString());
    }
}
