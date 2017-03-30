package 对象克隆;

/**
 * Created by scric on 2017/3/30.
 * @since 测试数组类型中的 clone 方法
 */
public class ArrayForClone {
    public static void main(String[] args) {

        //定义一个整型数组 ,
        int[] luckNumbers = {2, 3, 5, 6, 1, 6, 5};
        // 克隆一个整型数组 并赋值给新数组 cloned
        int[] cloned = luckNumbers.clone();

        // 输出
        for (int luckNumber : luckNumbers) {
            System.out.print(luckNumber);
        } //2356165

        System.out.println("");
        for (int aCloned : cloned) {
            System.out.print(aCloned);
        } //2356165

        System.out.println("");

       System.out.println(luckNumbers[5]); //6
       System.out.println(cloned[5]);   //   6

        //更改克隆数组中的数值, 看有无改变
       System.out.println(cloned[5] = 12); //12
       System.out.println(luckNumbers[5]); //6


    }
}
