import java.util.Arrays;

/**
 * Created by scric on 2017/3/20.
 * @version 1.0
 * @author scric
 * 介绍：介绍数组的使用和详细应用。
 */
public class Array {
    public static void main(String[] args) {
        //数组

        int[] a = new int[100]; // 指出了数组类型为int ，数组变量名为a ，创建了一个可以存储100个整数的数组。
        //int a[] = new int[100]; // 这种形式也是可以的。
        //注意，这个数组下标从0开始，到99.

        //赋值
        for (int i = 0; i < 100; i++) {
            a[i] = i; // 将i的值赋值给a[i]
            System.out.println(a[i]); //输出从0到99
        }
        //System.out.println(a[100]); //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 100.报错，数据溢出。

        System.out.println("-----");
        //那我们如何知道数组中元素的个数呢？

        System.out.println(a.length); //100

        //需要注意的是:一旦创建了数组，就不能再改变它的大小。如果需要经常在运行过程中扩展数组的大小，应该使用另一种数据结构--数组列表(array list)
        //现在拥有的只是对数组的一个引用。

        //for each 循环 结构: for(variable:collection) statement
        for (int element : a //定义一个int类型的element变量，用于暂存集合中的每一个元素，并执行相应的语句
                ) {
            System.out.println(element); //打印数组a的每一个元素、-----------------
        }//循环a中的每一个元素(for each element in a )，效果和上面的代码相同。

        //数组初始化及匿名数组

        int[] smallPrimes = {2, 3, 5, 7, 11, 13}; //简化书写形式，不需要调用new

        smallPrimes = new int[]{17, 19, 23, 29, 31, 37}; //重新初始化一个变量


        //数组拷贝 。 在java中，允许将一个数组变量拷贝给另外一个数组变量。这时两个变量将引用同一个数组。
        int[] luckyNumbers = smallPrimes;
        luckyNumbers[5] = 12; // 现在smallPrimes[5]=12
        System.out.println(luckyNumbers);//[I@1b6d3586 ,它返回了一组地址值，提示要用toString方法输出.
        System.out.println(Arrays.toString(luckyNumbers)); //[17, 19, 23, 29, 31, 12]
        System.out.println(Arrays.toString(smallPrimes));//[17, 19, 23, 29, 31, 12] ,而不是{17, 19, 23, 29, 31, 37}

        //如果希望将一个数组的所有值都拷贝到一个新的数组中去。如何做呢？使用Arrays类的copyTo方法
        int[] copiedLuckyNumber = Arrays.copyOf(luckyNumbers, luckyNumbers.length);
        System.out.println(Arrays.toString(copiedLuckyNumber)); //[17, 19, 23, 29, 31, 12]
        luckyNumbers = Arrays.copyOf(luckyNumbers, 2 * luckyNumbers.length);
        System.out.println(Arrays.toString(luckyNumbers)); //[17, 19, 23, 29, 31, 12, 0, 0, 0, 0, 0, 0] ,如果数组元素是数值型，则多余的元素将被赋值为0
        smallPrimes = Arrays.copyOf(smallPrimes, smallPrimes.length / 2);
        System.out.println(Arrays.toString(smallPrimes));//[17, 19, 23] .如果长度小于原始数组的长度，则只拷贝最前面的数据元素


        //数组排序 ，想要对数值型数组进行排序，可以使用Arrays类中的sort方法。

        Arrays.sort(luckyNumbers);
        System.out.println(Arrays.toString(luckyNumbers));//[0, 0, 0, 0, 0, 0, 12, 17, 19, 23, 29, 31]

        //更详细的内容可以看 LotteryDrawing.java

        System.out.println(Arrays.binarySearch(luckyNumbers, 19)); //8 ,19的下标为8
        Arrays.fill(luckyNumbers, 8);
        System.out.println(Arrays.toString(luckyNumbers)); //[8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8] 将数组中的所有数据元素值设置为8

        int[] sameNumber = luckyNumbers;
        System.out.println(Arrays.equals(sameNumber,luckyNumbers)); //true
        System.out.println(Arrays.equals(sameNumber, smallPrimes)); //false


        //多维数组 ，详细内容可看 CompoundInterest.java
        //不规则数组 ，详细内容可看LotteryArray.java

    }
}
