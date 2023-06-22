package com.compvisia.graph.Utils;



/**
 *
 * A class for more math functions.
 * <p>
 * This includes clamp, lerp, invLerp and more.
 *
 * @author Youri Schijff
 * @since 1.0 (c-1)
 */
public final class Mathf {

    public static final double PI = 3.1415926535897;

    /**
     * Clamps a value from min to max.
     *
     * @param min minimum value
     * @param max maximum value
     * @param val the value to be clamped
     * @return the result of the clamp
     */
    public static double clamp(double min, double max, double val) {
        return Math.min(Math.max(min, val), max);
    }

    /**
     * Linear interpolation (lerp).
     * <p>
     * lerps the value to a double value in between min and max.
     * <p>
     * e.g. lerp(10,20,0.5) = 15.0
     *
     * @param min minimum value
     * @param max maximum value
     * @param val double floating point
     * @return the result of the lerp
     */
    public static double lerp(double min, double max, double val) {
        return (1 - val) * min + max * val;
    }

    /**
     * Inverse Linear interpolation (invLerp).
     * <p>
     * lerps the value to a decimal value if min was 0 and max was 1.
     * <p>
     * e.g. invLerp(10,20,15) = 0.5
     *
     * @param min minimum value
     * @param max maximum value
     * @param val double value
     * @return the result of the invLerp
     */
    public static double invLerp(double min, double max, double val) {
        return (val - min) / (max - min);
    }

    /**
     * Remaps a value.
     * <p>
     * invLerp with val, min0 and max0, then lerp with result, min1 and max1
     * <p>
     * e.g. remap(10,100,30,300,40) = 150.0
     *
     * @param min0 minimum value used for invLerp
     * @param max0 maximum value used for invLerp
     * @param min1 minimum value used for lerp
     * @param max1 maximum value used for lerp
     * @param val the value to be remapped
     * @return the result of the remap
     */
    public static double remap(double min0, double max0, double min1, double max1, double val) {
        return lerp(min1,max1,invLerp(min0,max0,val));
    }
}
