package com.compvisia.graph.Utils;

/**
 *
 * A 2D class used to define a size for an object.
 *
 * @param width  a value of the object
 * @param height a value of the object
 * @author Youri Schijff
 * @since 1.0 (c-1)
 */
public record Size(double width, double height) {

    /**
     * Returns a Size object with sides width and height.
     *
     * @param width  width of object
     * @param height height of object
     * @return a new Size object
     */
    public static Size of(double width, double height) {
        return new Size(width, height);
    }
    /**
     * Returns a Size object with equal size lengths.
     *
     * @param length the length side of object
     * @return a new Size object
     */
    public static Size square(double length) {
        return new Size(length, length);
    }

}
