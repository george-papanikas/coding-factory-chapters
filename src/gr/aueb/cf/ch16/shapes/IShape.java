package gr.aueb.cf.ch16.shapes;

@FunctionalInterface // we can have only one abstract class
public interface IShape {

    /**
     * Returns the id of the {@link IShape}
     * @return
     *      the id key.
     */

    long getId();
}
