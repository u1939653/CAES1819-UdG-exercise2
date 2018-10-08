package edu.udg.caes;

import org.junit.jupiter.api.Test;

import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;

public class Exercise2Test
{
    //Test que funciona segons les especificacions
    @Test
    public void unioDuesLlistesDeInt()
    {
        Vector l_vectorA = new Vector();
        l_vectorA.add(1);
        l_vectorA.add(2);

        Vector l_vectorB = new Vector();
        l_vectorB.add(3);
        l_vectorB.add(4);

        Vector l_vectorResposta = new Vector();
        l_vectorResposta.add(1);
        l_vectorResposta.add(2);
        l_vectorResposta.add(3);
        l_vectorResposta.add(4);

        Vector l_result = Exercise2.union(l_vectorA,l_vectorB);
        assertEquals(l_vectorResposta,l_result,"");
    }

    //AMBIGUETAT 1: Si un element és null, hauria de retornar null
    @Test
    public void unioAmbUnaLlistaANullTest()
    {
        Vector l_vectorA = new Vector();
        l_vectorA.add(1);
        l_vectorA.add(2);

        Vector l_vectorB = null;

        assertThrows(InputMismatchException.class, () -> Exercise2.union(l_vectorA,l_vectorB));
    }

    //AMBIGUETAT 2: No s'haurien de permetre repetits
    @Test
    public void unioSenseRepetitsTest()
    {
        Vector l_vectorA = new Vector();
        l_vectorA.add(1);
        l_vectorA.add(2);

        Vector l_vectorB = new Vector();
        l_vectorB.add(1);
        l_vectorB.add(2);

        Vector l_vectorResposta = new Vector();
        l_vectorResposta.add(1);
        l_vectorResposta.add(2);

        Vector l_result = Exercise2.union(l_vectorA,l_vectorB);
        assertEquals(l_vectorResposta,l_result,"");
    }

    //AMBIGUETAT 3: Els vectors han de contenir elements del mateix tipus
    @Test
    public void unioDeDiferentsTipusTest()
    {
            final Vector l_vectorA = new Vector();
            l_vectorA.add(1);
            l_vectorA.add(2);

            final Vector l_vectorB = new Vector();
            l_vectorB.add(new GregorianCalendar());

            assertThrows(InputMismatchException.class, () -> Exercise2.union(l_vectorA,l_vectorB));
    }


}
