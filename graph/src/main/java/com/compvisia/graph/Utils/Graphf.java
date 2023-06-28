package com.compvisia.graph.Utils;

import static java.lang.Math.pow;
import static java.lang.Math.round;

/**
 *
 * A class for graph functions.
 * <p>
 * This includes mostly grid based graph functions.
 * <p>
 * All the functions return y.
 *
 * @author Youri Schijff
 * @since 1.0 (c-1)
 */
public final class Graphf {

    /**
     * Linear graph function.
     * <p>
     * An infinitely long line that goes at an angle.
     * <p>
     * e.g. y = (a * x) + b
     *
     * @param a slope of the line
     * @param b the intercept (height if x is zero)
     * @param x value in the x direction
     * @return y, the result of the function at x
     */
    public static double linear(double a, double b, double x) {
        return round((a * x + b) * 100.0) / 100.0;
    }

    /**
     * Parabolic graph function.
     * <p>
     * An infinitely long curve that is mirror-symmetrical and is (approximately) a U-shape.
     * <p>
     * e.g. y = (a * x^2) + b
     *
     * @param a width of the parabola
     * @param b the intercept (height if x is zero)
     * @param x value in the x direction
     * @return y, the result of the function at x
     */
    public static double parabola(double a, double b, double x) {
        return round((a * pow(x,2) + b) * 100.0) / 100.0;
    }

    /**
     * Cubic function
     * <p>
     * An infinitely long curve with the 3rd polynomial degree.
     * <p>
     * e.g. y = (a * x^3) + (b * x^2) + (c * x) + d
     *
     * @param a 3rd polynomial (single line in tan(x) as a graph)
     * @param b 2nd polynomial (parabola)
     * @param c 1st polynomial (linear)
     * @param d the intercept (height if x is zero)
     * @param x value in the x direction
     * @return y, the result of the function at x
     */
    public static double cubic(double a, double b, double c, double d, double x) {
        return round((a*pow(x,3)+b*pow(x,2)+c*x+d) * 100) / 100.0;
    }

    /**
     * Creates a graph through 2 points.
     * <p>
     * e.g. y = (y2-y1) / (x2-x1) * (x-x1) + y1
     *
     * @param a First point
     * @param b Second point
     * @param x value in the x direction
     * @since 1.0 (c-4)
     * @return y, the result of the function at x
     */
    public static double thruPoints(Point a, Point b, double x) {
        return (b.y()-a.y())/(b.x()-a.x())*(x-a.x())+a.y();
    }
}
