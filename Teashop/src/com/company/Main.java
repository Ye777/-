package com.company;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        //测试Bubble类,Cocount类,Milktea类的功能
        Bubble bubble=new Bubble("zhenzhu",2019,11,6);
        Cocount cocount=new Cocount("yeguo",2019,11,6);
        System.out.println(bubble.toString());
        System.out.println(cocount.toString());
        MilkTea tea1=new MilkTea("naicha",bubble);
        System.out.println(tea1.toString());
        System.out.println();


        //测试Teashop的功能
        Calendar Today=Calendar.getInstance();
        Teashop XIER=new Teashop();
        Bubble bubble1=new Bubble("珍珠1");//生产日期为今天
        Bubble bubble2=new Bubble("珍珠2",2019,10,20);//已经过期的珍珠
        Cocount cocout1=new Cocount("椰果1");
        Cocount cocout2=new Cocount("椰果2",2019,10,20);

        XIER.jinhuo(bubble1);XIER.jinhuo(bubble2);XIER.jinhuo(cocout1);XIER.jinhuo(cocout2);//进货
        XIER.show();

        XIER.sale("奶茶1","Bubble",Today);//成功售出奶茶+珍珠
        XIER.sale("奶茶2","Cocount",Today);//成功售出奶茶+椰果

        XIER.sale("奶茶3","Bubble",Today);//珍珠配料已空，异常
        XIER.sale("奶茶4","Cocount",Today);//椰果配料已空，异常



    }
}
