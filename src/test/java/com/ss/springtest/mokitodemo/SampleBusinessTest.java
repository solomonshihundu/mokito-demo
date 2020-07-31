package com.ss.springtest.mokitodemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SampleBusinessTest
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

    /**
     * Test Case 1
     */
    @Test
    public void findGreatestOfAllNumsTest()
    {
        DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.returnAllNums()).thenReturn(new int[]{24,67,1,0,5});
        SampleBusiness sampleBusiness = new SampleBusiness(dataServiceMock);
        assertEquals(67,sampleBusiness.findGreatestOfAllNums());

    }

    /**
     * Test case 2
     */
    @Test
    public void findGreatestOfOneNumTest()
    {
        DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.returnAllNums()).thenReturn(new int[]{5});
        SampleBusiness sampleBusiness = new SampleBusiness(dataServiceMock);
        assertEquals(5,sampleBusiness.findGreatestOfAllNums());
    }

}
