/**
 * Created by scric on 2017/3/17.
 * @version 1.0
 * @author scric
 */

public class Varible {
    public static void main(String[] args) {
        //变量的讲解

        // 在Java中，每一个变量属于一种类型(type).

        double salary; // 所以变量salary被声明为double类型。而且在声明变量时，变量所属的类型位于变量名之前。

        //需要注意的是，变量也有其命名规则：特殊符号不能出现在变量名中，空格也不行。长度无限制。

        //double 12v; //Error:(13, 9) java: 不是语句 .这说明数字不能用于开头
        double v12;
        //double _d+;  //Error:(15, 18) java: 需要';' ,报错。

        //另外，不能将变量名命名为Java保留字
        //double double;  //Error:(17, 9) java: 不是语句 .报错

        //大小写敏感。
        double Salary,SALARY; // 可以在一行中声明多个变量。
        //double salary //Error:(23, 16) java: 已在方法 main(java.lang.String[])中定义了变量 salary


        //变量的初始化。


        //System.out.println(salary); //Error:(27, 28) java: 可能尚未初始化变量salary . 报错
        //这说明我们千万不要使用未被初始化的变量。那么我们就可以怎么做呢？

        salary = 12; //对一个已经声明过的变量进行赋值，赋值为12

        double adouble = 21; //也可以将变量的声明和初始化放在同一行。
        System.out.println(adouble); //21.0 .

        //虽然可以将声明放在代码中的任何地方。但也有例外。

//        System.out.println(afloat); //Error:(39, 28) java: 找不到符号 ; 因为在通常意义下，代码是从上而下读的。
//        double afloat = 12;

        //所以我们应该先声明，再使用变量。而且，变量的声明要尽可能地靠近变量第一次使用的地方，这是一种良好的程序编写风格。


        //常量

        final int  NUM =22; //利用关键词final指示常量。习惯上常量名使用全大写。
        System.out.println(NUM);//这个变量只能被赋值一次，一旦被赋值后就不能更改了。

//        NUM=54;
//        System.out.println(NUM); //Error:(49, 9) java: 无法为最终变量NUM分配值

        //在Java中，如果希望某个常量可以在一个类中的多个方法中使用，可以使用关键字static final 设置一个类常量。
        //但是，类常量的定义应该位于main方法的外部，这样，同一个类的其他方法都可以使用这个常量。
        //如果一个常量被声明为public，那么其他类的方法也可以使用这个常量。



    }
}
