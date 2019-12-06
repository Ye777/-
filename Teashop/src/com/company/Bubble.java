package com.company;

import java.util.Calendar;

public class Bubble extends Ingredient{
    private final int baozhiqi=7;
    Bubble(String name,int year,int month,int ri)
    {
        super(name,year,month,ri);
        deadline.add(deadline.DATE,baozhiqi);
    }
    Bubble(String name)
    {
        super(name);
        deadline.add(deadline.DATE,baozhiqi);
    }
    public String toString ()
    {
        return "该珍珠的名字为"+name+",生产日期为"+date.getTime()+",保质期为7天。";
    }
}
