package com.ss.springtest.mokitodemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SampleBusinessAnnotationsTest
{
    /**
     *
     * Without using mockito the DataServiceStub class would have to  be created
     * very single time a new test case is required.This is inefficient
     *
     *
     @Test
     public void findGreatestOfAllNumsTest()
     {
     SampleBusiness sampleBusiness = new SampleBusiness(new DataServiceStub());
     assertEquals(90,sampleBusiness.findGreatestOfAllNums());
     }
     */

    @Mock
    DataService dataServiceMock;

    @InjectMocks
    SampleBusiness sampleBusiness;

    /**
     * Test Case 1
     */
    @Test
    public void findGreatestOfAllNumsTest()
    {
        when(dataServiceMock.returnAllNums()).thenReturn(new int[]{24,67,1,0,5});
        assertEquals(67,sampleBusiness.findGreatestOfAllNums());

    }

    /**
     * Test case 2
     */
    @Test
    public void findGreatestOfOneNumTest()
    {
        when(dataServiceMock.returnAllNums()).thenReturn(new int[]{5});
        assertEquals(5,sampleBusiness.findGreatestOfAllNums());
    }

    /**
     * Test case 3
     */
    @Test
    public void findGreatestOfNullTest()
    {
        when(dataServiceMock.returnAllNums()).thenReturn(new int[]{});
        assertEquals(Integer.MIN_VALUE,sampleBusiness.findGreatestOfAllNums());
    }
}
