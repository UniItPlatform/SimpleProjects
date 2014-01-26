package shapes;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by boutinov on 1/26/14.
 */
public class ShapeInitializer {

public static GeometricShape getShape(String name) {
    Object obj = null;
    Class c;
    try {
        c = Class.forName("shapes." + name);
//        Class[] paramTypes = new Class[] {};
        Constructor constructor = c.getConstructor(/*paramTypes*/);
        obj = constructor.newInstance();
    } catch (ClassNotFoundException e) {
        System.out.println("No such shape found");
    } catch (InstantiationException e) {
        e.printStackTrace();
    } catch (IllegalAccessException e) {
        e.printStackTrace();
    } catch (NoSuchMethodException e) {
        e.printStackTrace();
    } catch (InvocationTargetException e) {
        e.printStackTrace();
    }
    return (GeometricShape)obj;
}

}
