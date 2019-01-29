package com.ggy.springcloudeureka;

import org.junit.BeforeClass;
import org.junit.Test;

import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class LocaleTest  {
    public static void main(String[] args) {
        Locale chinaLocale;
        Locale americaLocale;
        chinaLocale = new Locale("zh", "CN");
        americaLocale = new Locale("en", "US");
        final double money = 2972.29d;
        NumberFormat format = NumberFormat.getCurrencyInstance(chinaLocale);
        System.out.println("中国：" + format.format(money));
        NumberFormat format2 = NumberFormat.getCurrencyInstance(americaLocale);
        System.out.println("美国：" + format2.format(money));

        //转换时间
        Date date=new Date();
        DateFormat format3=DateFormat.getDateInstance(DateFormat.MEDIUM, chinaLocale);
        System.out.println("中国：" +format3.format(date));

        DateFormat format4=DateFormat.getDateInstance(DateFormat.MEDIUM, americaLocale);
        System.out.println("美国：" +format4.format(date));

        //两者之上的格式化
        //定义占位符参数
        Object[] params={"Jack",new GregorianCalendar().getTime(),238.2E5};

        String pattern1="{0}，您好！您的账户在 {1} 收到 {2} 元";
        System.out.println(MessageFormat.format(pattern1,params));//使用默认本地化对象

        String pattern2="{0}，hello！Your account have received {2,number,currency} at {1," +
                "time,short} on " +
                "{1,date,long}";
        System.out.println(new MessageFormat(pattern2,Locale.US).format(params));//使用指定的本地化对象
    }

}
