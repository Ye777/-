package com.company;

import java.util.Calendar;

public class Cocount extends Ingredient{
    private final int baozhiqi=5;
    Cocount(String name,int year,int month,int ri)
    {
        super(name,year,month,ri);
        deadline.add(deadline.DATE,baozhiqi);
    }
    Cocount(String name)
    {
        super(name);
        deadline.add(deadline.DATE,baozhiqi);
    }
    public String toString ()
    {
        return "该椰果的名字"+name+",生产日期为"+date.getTime()+",保质期为5天。";
    }
}