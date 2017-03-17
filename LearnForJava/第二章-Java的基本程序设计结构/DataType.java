/**
 * Created by scric on 2017/3/16.
 * @version 1.0
 * @author scric
 */

public class DataType {
    public static void main(String[] args) {

        //整型
        int a = 10;  //整型用于表示没有小数部分的数值。
        int b = -1;  //它允许是负数

        System.out.println(a);
        System.out.println(b);

        //如果数值带有小数，那它会如何处理呢？

        //int c = 11.9;  //内容报错
        //System.out.println(c); //Error:(12, 17) java: 不兼容的类型: 从double转换到int可能会有损失

        //整型也有很多类
        byte d = 99;  // 定义 d为byte类型，并赋值为99
        System.out.println(d);
        // 那byte和int的区别在哪里呢？它和其他类型比如short long 这些类型有什么区别呢？
//        byte e = 128;
//        System.out.println(e); //Error:(22, 18) java: 不兼容的类型: 从int转换到byte可能会有损失
//        byte f = -129;
//        System.out.println(f); //Error:(24, 18) java: 不兼容的类型: 从int转换到byte可能会有损失

        // 这说明它们的区别可能在它们的取值范围。
        // 更详细的内容请搜索百度

        // 需要注意的是，Java没有任何无符号类型(unsigned)


        //浮点类型

        float g = 1; //浮点类型用于表示有小数的部分
        System.out.println(g);  //1.0
        //但是却不能将1.2直接赋值给h
//        float h = 1.2;
//        System.out.println(h); //Error:(39, 19) java: 不兼容的类型: 从double转换到float可能会有损失
        float i = 1.2F;   //float 类型的数值有一个后缀F(例如，3.14F)。没有后缀F的浮点数值默认为double类型，这也是为什么上一段代码出错的原因
        System.out.println(i);//1.2
        float j = 1.22222222222222F;
        System.out.println(j); //1.2222222  还是float类型。但是其有效位数为七位。

        // 在大多数情况下，程序都采用double类型
        double k = 1; // 定义为double类型
        System.out.println(k); //1.0 和上面的 g 比较，发现其都为1.0.


        // char 类型

        char l = 'A'; // char 类型用于表示单个字符。通常用来表示字符常量
        System.out.println(l); //A ,'A'是编码为65所对应的字符常量

        char m = 65;   // 将m定义为char类型，并赋值为65
        System.out.println(m); // A ， 那么，如何输出从A到Z的字符常量呢？

        System.out.println("-------");
        for (char ch=65;;ch++) {  // 这是一个循环语句，后面会讲。
            System.out.print(ch); // ABCDEFGHIJKLMNOPQRSTUVWXYZ,如果想要输出小写字母，该如何改呢？
            if (ch == 'Z') {  //判断语句，如果ch等于Z，就退出循环。
                System.out.println(); // 换行
                break;
            }
          }
        //是不是不知道小写字母的编号？如果想要弄清char类型，就必须了解Unicode编码表
        //Unicode编码单元可以表示为十六进制值，其范围从\u0000到\Uffff
        //强烈建议不要在程序中使用char类型，了解即可。


        // boolean 类型

        //boolean类型有两个值，false和true
        //详细内容可以看Operator的


        //那么数值之间可不可以转换呢？
        int n = 123456789;
        System.out.println(n); //123456789
        float f = n;
        System.out.println(f); //1.23456792E8  优先级为 double>float>long>int

        //在必要的时候，int类型的值会自动地转换为double类型。
        //有时候也需要将double转换成int，
        double x = 9.997;
        int nx = (int) x;
        System.out.println(nx); //9
    }



}
