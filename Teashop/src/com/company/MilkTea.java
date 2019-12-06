package com.company;

public class MilkTea {
    private String name;
    private Ingredient a;
    MilkTea(String name1)
    {
        name=name1;
    }

    MilkTea(String name1,Ingredient b)
    {
        name=name1;
        a=b;
    }
    String getName()
    {
        return name;
    }
    public String toString()
    {
        if(a instanceof Bubble)
        {return "这杯奶茶的名字为"+name+",配料是珍珠,"+a.toString();}
        else
        {
            return "这杯奶茶的名字为"+name+",配料是椰果,"+a.toString();
        }
    }

}
