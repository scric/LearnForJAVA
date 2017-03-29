package 参数数量可变的方法;

/**
 * Created by scric on 2017/3/29.
 */
public class autoNum {
    public static void main(String[] args) {

        //计算若干个数值的最大值
        double m = max(3.1, 40.4, -5, 99);
        System.out.println(m); //99.0

    }

    public static double max(double... values) {
        double largest = Double.MIN_VALUE;
        for (double v : values) {
            if (v > largest) {
                largest = v;
            }
        }
        return largest;
    }
}
