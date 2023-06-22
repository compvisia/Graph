package com.compvisia.graph.Utils;

/**
 *
 * A 2D class used to define a position (Point) for an object.
 *
 * @param x a value of the object
 * @param y a value of the object
 * @author Youri Schijff
 * @since 1.0 (c-1)
 */
public record Point(double x, double y) {

    private static final Point BASE = new Point(0,0);

    /**
     * Returns the base.
     * <p>
     * BASE is defined as 0,0.
     *
     * @return the base of the point object
     */
    public static Point base() {
        return BASE;
    }

    /**
     * Returns a Vector object with an x and y position.
     *
     * @param x x value of the object
     * @param y y value of the object
     * @return a new Point object
     */
    public static Point at(int x, int y) {
        return new Point(x,y);
    }
}