import java.util.Arrays;

/**
 * Created by scric on 2017/3/27.
 */
public class Object {
    public static void main(String[] args) {
        //数组继承了object类的toString方法,数组类型将按照旧的格式打印

        int[] luckNumbers = {2, 3, 5, 6, 11, 13};
        String s = "" + luckNumbers;
        System.out.println(s); //[I@1b6d3586
        // 前缀[I表明是一个整数数组

        //修正方法 - 调用静态方法Arrays.toString()
        String str = Arrays.toString(luckNumbers);
        System.out.println(str); //[2, 3, 5, 6, 11, 13]

        //如果想打印一个多维数组呢?

        int[][] deepNumbers = {
                {2, 3, 5},
                {6},
                {24}
        };
        String string = Arrays.deepToString(deepNumbers);
        System.out.println(string); //[[2, 3, 5], [6], [24]]
    }
}
