/**
 * Created by scric on 2017/3/17.
 * @version 1.0
 * @author scric
 * 功能: 将华氏温度转换为摄氏温度
 */



import java.util.*;

public class TranTem {
    public static void main(String[] args) {
        //主体
        System.out.println("请输入华氏温度：");
        Scanner in = new Scanner(System.in);
        double tem = in.nextInt();
        System.out.println("转化后的摄氏温度是："+ tranTo(tem) + "C");

    }
    //定义一个函数将华氏温度转换为摄氏温度。
    private static double tranTo(double data) {
        return ((9 / 5) * data) + 32;
    }
}

