package com.ss.springtest.mokitodemo;

public class DataServiceStub implements DataService
{
    @Override
    public int[] returnAllNums() {
        return new int []{12,45,90,1,0,-1,2};
    }
}
