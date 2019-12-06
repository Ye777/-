package com.company;

import java.util.Calendar;

 public abstract class Ingredient{
    protected String name;
    protected Calendar date;
    protected Calendar deadline;
    Ingredient(String name,int year,int month,int ri)
    {
        this.name=name;
        date=Calendar.getInstance();
        date.set(year,month,ri);
        deadline=Calendar.getInstance();
        deadline.set(year,month,ri);
    }
    Ingredient(String name)
    {
        this.name=name;
        date=Calendar.getInstance();
        deadline=Calendar.getInstance();
    }
    String getName()
    {
        return name;
    }
}


