/**
 * Created by scric on 2017/3/17.
 * @version 1.0
 * @author scric
 */
public class Operator {
    public static void main(String[] args) {
        //运算符

        int x = 12; //将变量x定义成为int类型，并赋值
        System.out.println(x); //12
        x += 4;   // 这个等价于 x = x + 4;
        System.out.println(x); //14

        x -= 4;  // 等价于 x = x - 4;
        System.out.println(x); //12

        int y = x / 5; //猜猜结果是多少？
        System.out.println("y = x / 5 的结果是:"+ y); //2
        x %= 5;   // 求余(取模) 结果是多少？
        System.out.println("x %= 5 的结果是:"+ x); //2





    }
}
