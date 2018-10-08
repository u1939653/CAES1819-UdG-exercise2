package edu.udg.caes;

import java.util.Vector;

public class Exercise2 {

    /**
     * Vector union operation
     *
     *  @param a first vector
     *  @param b second vector
     *  @return objects that are in either one of the two argument vectors
     */
    public static Vector union (Vector a, Vector b)
    {
        Vector l_union = new Vector();
        l_union.addAll(a);
        l_union.addAll(b);
        return l_union;
    }

}
