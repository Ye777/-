package com.company;

import java.util.ArrayList;
import java.util.Calendar;

class  SoldOutException extends Exception{}


 interface Shop{
    public void jinhuo(Ingredient a);
    public void sale(String milkname, String inname, Calendar today);
}

public class Teashop implements Shop{
    private ArrayList<Bubble> Bubbles;
    private ArrayList<Cocount> Cocouts;
    Teashop()
    {
        Bubbles=new ArrayList<Bubble>();
        Cocouts=new ArrayList<Cocount>();
    }

    @Override
    //进货方法
    public void jinhuo(Ingredient a) {
        if(a instanceof Bubble)
            add((Bubble) a);
        if(a instanceof Cocount)
            add((Cocount) a);
    }
    //出售方法，异常处理
    public void sale(String milkname, String inname, Calendar today) {
        MilkTea a=new MilkTea(milkname);
        int k=0,j=0;
        for(int i=0;i<Bubbles.size();i++)
        {
            if(today.after(Bubbles.get(i).deadline))
            {
                Bubbles.remove(i);
                i--;
            }

        }
        for(int i=0;i<Cocouts.size();i++)
        {
            if(today.after(Cocouts.get(i).deadline))
            {
                Cocouts.remove(i);
                i--;
            }

        }
        if(inname.equals("Bubble")) {

            try {
                judge(inname);

                System.out.println("售出奶茶，"+"奶茶名为"+a.getName());
                Bubbles.remove(Bubbles.size()-1);

            } catch (SoldOutException se) {
                System.out.println("珍珠已售完");
            }
        }
        if(inname.equals("Cocount")) {
            try {
                judge(inname);

                System.out.println("售出奶茶，"+"奶茶名为"+a.getName());
                Cocouts.remove(Cocouts.size()-1);

            } catch (SoldOutException se) {
                System.out.println("椰果已售完");
            }
        }
    }
    //判断配料是否已经售空，包含抛出异常
    public  void judge(String inname) throws SoldOutException
    {
        if(inname.equals("Bubble"))
        {
            if(Bubbles.isEmpty())
                throw new SoldOutException();
        }
        if(inname.equals("Cocount"))
        {
            if(Cocouts.isEmpty())
                throw new SoldOutException();
        }

    }
    //两个添加方法，重载
    private void add(Bubble x)
    {
        Bubbles.add(x);
    }
    private void add(Cocount x) {
        Cocouts.add(x);
    }
    public void show()
    {
        System.out.println("此时奶茶店有"+Bubbles.size()+"份珍珠,"+Cocouts.size()+"份椰果");
    }
}
