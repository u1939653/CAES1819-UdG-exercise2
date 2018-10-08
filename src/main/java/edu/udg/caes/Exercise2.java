package edu.udg.caes;

import java.util.InputMismatchException;
import java.util.Vector;

public class Exercise2 {

    /**
     * Vector union operation
     *
     *  @param a first vector
     *  @param b second vector
     *  @return objects that are in either one of the two argument vectors
     * @throws InputMismatchException if the vectors do not share types
     * @throws IllegalArgumentException in case any of the vectors are null
     */
    public static Vector union (Vector a, Vector b)
    {
        if (a==null || b==null)
        {
            throw new IllegalArgumentException("No s'admeten vectors nulls");
        }

        if (!a.isEmpty() && !b.isEmpty() && !a.get(0).getClass().equals(b.get(0).getClass()))
        {
            throw new InputMismatchException();
        }

        Vector l_union = new Vector();

        for (int i = 0 ; i < a.size() ; i++ )
        {
            if (!l_union.contains(a.get(i)))
            {
                l_union.add(a.get(i));
            }
        }

        for (int i = 0 ; i < b.size() ; i++ )
        {
            if (!l_union.contains(b.get(i)))
            {
                l_union.add(b.get(i));
            }
        }
        return l_union;
    }

}
