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

//        System.out.println("x/0的结果是:"+ x/0); //报错，产生一种异常
//        System.out.println("4.0/0的结果是：" + 4.0 / 0); //4.0/0的结果是：Infinity

        x -= 4;  // 等价于 x = x - 4;
        System.out.println(x); //12

        int y = x / 5; //猜猜结果是多少？
        System.out.println("y = x / 5 的结果是:"+ y); //2
        //发现小数部分被截去了，而且也并没有四舍五入。如果想要保留小数部分，应该怎么做呢？更改一下声明试试。
        double z = x / 5;   //声明为double类型，并赋值为 x/5
        System.out.println(z);  // 2.0 .为什么不是2.4？ 你应该注意到的是，x是int类型，而5也是整型。其结果x/5也是整型,所以结果应该是2.后被声明为double类型，所以为2.0，没毛病。
        double k = x / 5.0; // x 是int类型。 5.0 为浮点数。所以 x/5.0 为浮点类型。 所以有小数部分。对吗？
        System.out.println(k);  //2.4 看来是正确的。


        x %= 5;   // 求余(取模) 结果是多少？
        System.out.println("x %= 5 的结果是:"+ x); //2

        //知道用法了吗？ 我们来玩个更高级一点的。
        // 请提取出 789 的个位，十位，百位，并输出。你不会直接print出它的个十百位吧...
        System.out.println("789的个位是:" + 789 % 10); // 9
        System.out.println("789的十位是：" + 789 % 100); //89 ，好像有点问题
        System.out.println("789的十位是：" + 789 / 10 % 10); // 8 .正确。 那789的百位该如何输出呢？

        //自增自减运算符
        int n = 12;
        n++; // n++ 将变量n的当前值加1，这是后缀形式
        System.out.println(n); //13
        int m = 12;
        m--; // m-- 将变量m的当前值减1，这也是后缀形式
        System.out.println(m); // 11
        //这些运算符改变了变量的值，所以它的操作数不能是数值。比如 4++,这是一条非法语句。
        int l = 12;
        ++l;  //++l 将变量l的当前值加1，这是前缀形式
        System.out.println(l); // 13
        //那后缀和前缀形式又有什么区别呢？

        //建议不要在其他表达式的内部使用++，这样编写的代码很容易令人困惑，并会产生烦人的BUG。？？为什么

        //关系运算与boolean运算符

        System.out.println(3==4);//使用 == 检测是否相等.如果相等，则输出true，不相等则false
        System.out.println(3!=4); // 使用 ！= 检测是否不相等。
        System.out.println(3>4);System.out.println(3>=4);

        System.out.println(x == 0 && y > 0);//java沿用了c++的习惯，用&&表示逻辑‘与’,false。
        System.out.println(x == 0 || y > 0);// ||表示逻辑“或"。true
        System.out.println(!(x==0)); //!表示逻辑非 。true
        //想想看，如果第一个操作数已经能够确定表达式的值，还有没有必要计算第二个操作数的值呢？

        //三元操作符 ?:
        //condition?expression1:expression2;当条件condition为真时计算第一个表达式，否则第二个表达式
        System.out.println(x > y ? x : y); // 返回并输出x和y中较小的那个值

        //位运算符（不讲）

        //数学函数与常量
        //在Math类中，包含了各种数学函数

        double v = 4;
        double b = Math.sqrt(v); // 使用sqrt方法求平方根
        System.out.println("v的平方根是:" + b); //v的平方根是:2.0

        double p = Math.pow(v, b); // 使用pow方法求平方。底是v，b是幂
        System.out.println("v的b次方是:" + p); //v的b次方是:16.0
        //还有其他的比如三角函数，指数函数等等。







    }
}
