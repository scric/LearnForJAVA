import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.DateFormatSymbols;

/**
 * Created by scric on 2017/3/22.
 */
public class GregorianCalendar2 {
    public static void main(String[] args) {
        //构建一个日历对象,并初始化
        GregorianCalendar da = new GregorianCalendar();

        int today = da.get(Calendar.DATE); //存储
        int month = da.get(Calendar.MONTH);
//        System.out.println(today); //22
//        System.out.println(month); //2

        da.set(Calendar.DAY_OF_MONTH, 1); //设置为这个月的第一天
        int weekday = da.get(Calendar.DAY_OF_WEEK); //得到这一天为
//        System.out.println(weekday);
        // 得到当前地区第一天为星期几

        int firstDayOfWeek = da.getFirstDayOfWeek();

        //确定需要缩进的距离

        int indent = 0;
        do {
            indent++;
            da.add(Calendar.DAY_OF_MONTH,-1);
            weekday =da.get(Calendar.DAY_OF_WEEK);
        } while (weekday != firstDayOfWeek);

        //输出星期几
        String[] weekdayName = new DateFormatSymbols().getShortWeekdays();

        do {
            System.out.printf("%4s", weekdayName[weekday]);
            da.add(Calendar.DAY_OF_MONTH, 1);
            weekday = da.get(Calendar.DAY_OF_WEEK);
        } while (weekday != firstDayOfWeek);

        System.out.println();
        for (int i =1;i<=indent;i++) {
            System.out.print("       ");
        }

        //打印日历内容

        da.set(Calendar.DAY_OF_MONTH, 1);

        do {
            int day = da.get(Calendar.DAY_OF_MONTH);
            System.out.printf("%6d", day);

            if (day == today) {
                System.out.print("*");
            } else System.out.print(" ");

            da.add(Calendar.DAY_OF_MONTH, 1);
            weekday = da.get(Calendar.DAY_OF_WEEK);

            if (weekday == firstDayOfWeek) {
                System.out.println();

            }
        } while (da.get(Calendar.MONTH) == month);

        if (weekday != firstDayOfWeek) {
            System.out.println();
        }


    }
}
