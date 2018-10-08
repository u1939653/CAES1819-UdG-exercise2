package edu.udg.caes;

import org.junit.jupiter.api.Test;

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
        assertArrayEquals(l_vectorResposta.toArray(),l_result.toArray(),"0");
    }