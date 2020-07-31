package com.ss.springtest.mokitodemo;

public class SampleBusiness {

    /**
     * dependency fetching data from our database
     */
    private DataService dataService;

    private int greatestNum = Integer.MIN_VALUE;

    /**
     * variable to store fetched data for manipulation
     */
    private int dataSet[];

    /**
     *
     * @return the greatest value of the given dataset
     */
    private int findGreatestOfAllNums()
    {
        dataSet = dataService.returnAllNums();

        for(int value:dataSet)
        {
            if(value>greatestNum)
            {
                greatestNum=value;
            }
        }

        return greatestNum;

    }

}
