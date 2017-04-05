package 内部类;

/**
 * Created by scric on 2017/4/5.
 * @since 用来测试静态内部类
 * 考虑计算数组中最小值和最大值的问题
 * 可以编写两个方法, 一个方法用于计算最小值, 另一个方法用于计算最大值. 在调用这两个方法时, 数组被遍历两次
 * 如果只遍历数组一次, 并能够同时计算出最小值和最大值, 那么就可以大大地提高效率
 *
 * 需要注意的是, 该方法必须返回两个数值, 所以应该定义一个包含两个值的类:
 */
public class StaticInnerClassTest {
    public static void main(String[] args) {
        //创建一个数组变量并初始化
        double[] d = new double[20];

        //使用一个循环为数组变量 d[i] 赋值
        for (int i = 0;i<d.length;i++) {
            d[i] = 100 * Math.random();
        }

        //创建 ArrayAlg 类的内部共有类 Pair 对象 p 并将其初始化, 内容为 ArrayAlg 类中的方法 minmax 所处理的 d 数组
        ArrayAlg.Pair p = ArrayAlg.minmax(d);
        System.out.println("min = " + p.getFirst());  // 调用 对象 p 中的 getFirst()获得最小值
        System.out.println("max = " + p.getSecond());

    }

    static class ArrayAlg {
        public static class Pair {
            //建立私有域
            private double first;
            private double second;

            //创建 Pair 类的构造器并初始化参数
            public Pair(double f, double s) {
                first = f;
                second = s;
            }

            //获得第一个数值
            public double getFirst() {
                return first;
            }

            //获得第二个数值
            public double getSecond(){
                return second;
            }
        }

        //创建一个 Pair 对象的方法  . minmax 方法可以返回一个 Pair 类型的对象.
        public static Pair minmax(double[] values) {
            double min = Double.MAX_VALUE;
            double max = Double.MIN_VALUE;
            for (double v : values) {
                if (min > v) {
                    min = v;
                }
                if (max < v) {
                    max = v;
                }
            }
            return new Pair(min, max);
        }
    }

}
