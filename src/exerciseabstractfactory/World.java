/*
 */
package exerciseabstractfactory;

/**
 *
 * @author flyberson
 */
public class World {

    private static String name;
    private static World instance = null;

    private World() {
    }

    public static World getInstance() {
        if (instance == null) {

            synchronized (World.class) {
                if (instance == null) {
                    instance = new World();
                }
            }
        }

        return instance;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
