package com.ss.springtest.mokitodemo;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {

    @Test
    public void singleTestCase()
    {
        List mockList = mock(List.class);
        when(mockList.size()).thenReturn(10);
        assertEquals(10,mockList.size());
        /**
         * all other assertEquals invocations will return 10;
         */
    }

    @Test
    public void multipleTestCase()
    {
        List mockList = mock(List.class);
        when(mockList.size()).thenReturn(10).thenReturn(20).thenReturn(30);
        assertEquals(10,mockList.size());
        assertEquals(20,mockList.size());
        assertEquals(30,mockList.size());
        assertEquals(30,mockList.size());
    }

    /**
     * Test with specific parameter
     */
    @Test
    public void specificParamTestCase()
    {
        List mockList = mock(List.class);
        when(mockList.get(0)).thenReturn("PARAM MOCK TEST");
        assertEquals("PARAM MOCK TEST",mockList.get(0));
        assertEquals(null,mockList.get(1));

    }

    /**
     * Test with generic parameter
     */
    @Test
    public void genericParamTestCase()
    {
        List mockList = mock(List.class);
        when(mockList.get(Mockito.anyInt())).thenReturn("PARAM MOCK TEST");
        assertEquals("PARAM MOCK TEST",mockList.get(0));
        assertEquals("PARAM MOCK TEST",mockList.get(1));

    }

}
