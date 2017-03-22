import java.util.*;
import java.text.DateFormatSymbols;

/**
 * Created by scric on 2017/3/22.
 * @version 1.0
 * @author scric
 * @apiNote :用来测试Calendar类中的方法
 */
public class GregorianCalendar1 {
    public static void main(String[] args) {


        GregorianCalendar d = new GregorianCalendar(); //构建一个日历对象,并用当前日期和时间进行初始化.

        //两次调用get方法获得当前的日,月
        int today = d.get(Calendar.DAY_OF_MONTH);//这个月的今天
        int month =d.get(Calendar.MONTH); //这个月


        d.set(Calendar.DAY_OF_MONTH, 1); //将d设置为这个月的第一天

        int weekday =d.get(Calendar.DAY_OF_WEEK);//得到第一天为星期几.

        int firstDayOfWeek =d.getFirstDayOfWeek();//获得当前地区星期的起始日


        //确定需要缩进的距离,将值赋给indent
        int indent = 0;
        while (weekday != firstDayOfWeek) {
            indent++;
            d.add(Calendar.DAY_OF_MONTH, -1); //???
            weekday =d.get(Calendar.DAY_OF_WEEK);
        }

        //输入表示星期几名称前的几个字母
        String[] weekdayName = new DateFormatSymbols().getShortWeekdays();//返回用户语种所命名的表示星期几的缩写字符串

        do {
            System.out.printf("%4s", weekdayName[weekday]);
            d.add(Calendar.DAY_OF_MONTH, 1);
            weekday =d.get(Calendar.DAY_OF_WEEK);
        }
        while (weekday != firstDayOfWeek);
        System.out.println();

        //输出本地星期的起始日和当前月份第一天所在星期的间距
        for (int i =1;i<=indent;i++) {
            System.out.print("       ");

        }


        d.set(Calendar.DAY_OF_MONTH, 1); //将d设置为当月的第一天
        do {
            int day =d.get(Calendar.DAY_OF_MONTH); //将值赋给day
            System.out.printf("%6d", day);

            if (day == today) {
                System.out.print("*");
            } else System.out.print(" ");
            d.add(Calendar.DAY_OF_MONTH, 1);
            weekday =d.get(Calendar.DAY_OF_WEEK);

            if (weekday == firstDayOfWeek)
                System.out.println();

        } while( d.get(Calendar.MONTH) == month);

        if (weekday != firstDayOfWeek) {
            System.out.println();
        }
    }
}
