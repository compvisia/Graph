package com.compvisia.graph.Utils;

import static java.lang.Math.pow;

/**
 *
 * A class for graph functions.
 * <p>
 * This includes mostly grid based graph functions.
 *
 * @author Youri Schijff
 * @since 1.0 (c-1)
 */
public final class Graphf {

    /**
     * Linear graph function.
     * <p>
     * An infinitely long line that goes at an angle
     * <p>
     * e.g. ax+b
     *
     * @param a slope of the line
     * @param b the intercept (height if x is zero)
     * @param x value in the x direction
     * @return the result of the function at x
     */
    public static double linear(double a, double b, double x) {
        return a*x+b;
    }

    /**
     * Parabolic graph function.
     * <p>
     * An infinitely long curve that is mirror-symmetrical and is (approximately) a U-shape.
     * <p>
     * e.g. ax^2+b
     *
     * @param a width of the parabola
     * @param b the intercept (height if x is zero)
     * @param x value in the x direction
     * @return the result of the function at x
     */
    public static double parabola(double a, double b, double x) {
        return a*pow(x,2)+b;
    }

    /**
     * Cubic function
     * <p>
     * An infinitely long curve with the 3rd polynomial degree.
     * <p>
     * e.g. ax^3+bx^2+cx+d
     * <p>
     *
     * @param a 3rd polynomial (single line in tan(x) as a graph)
     * @param b 2nd polynomial (parabola)
     * @param c 1st polynomial (linear)
     * @param d the intercept (height if x is zero)
     * @param x value in the x direction
     * @return the result of the function at x
     */
    public static double cubic(double a, double b, double c, double d, double x) {
        return a*pow(x,3)+b*pow(x,2)+c*x+d;
    }
}
