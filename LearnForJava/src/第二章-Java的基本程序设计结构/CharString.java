/**
 * Created by scric on 2017/3/18.
 * @version 1.0
 * @author scric
 */
public class CharString {
    public static void main(String[] args) {
      //字符串
        //Java没有内置的字符串类型，而是在标准Java类库中提供了一个预定义类，叫做String。
        String e = ""; // 定义了一个空的字符串类型，每个用双引号括起来的字符串都是String类的一个实例
        String greeting = "Hello"; //
        System.out.println(e); //
        System.out.println(greeting); //Hello

        //提取子串
        // String类的substring方法可以从一个较大的字符串中提取一个子串
        String s = greeting.substring(0, 3); //从0开始计数，直到3为止，但不包括3
        System.out.println(s); //Hel
        //如果想提取出"lo" 那应该怎么做呢？
        String q = greeting.substring(3, 5); //从2开始计数，知道5为止，但不包括5
        System.out.println(q); //lo

        //拼接，
        //如果想将s,和q拼接起来，应该怎么做呢？

        String w = s + q; // 将"Hello"赋值给w 。 Java允许使用+号连接两个字符串
        System.out.println(w); //Hello ，单词之间没有空格，按给定的顺序拼接起来.
        //是吗？
        String r = q + s;
        System.out.println(r);  //loHel

        //可以将一个字符串和另一个非字符串的值进行拼接吗？
        String t = "RPG"; //注意字符串要加双引号。
        int y = 27; //定义一个int类型变量

        String u = t + y; //进行拼接
        System.out.println(u); //RPG27

        //也可以体现在输出语句中
        System.out.println("最厉害的武器是:" + u); //最厉害的武器是:RPG27 .记得用+号连接。

        //不可变字符串
        //String类没有提供用于修改字符串的方法，所以把String类对象称为不可变字符串。
        //字符串"Hello"永远包含字符H,e,l,l,o，而不能修改其中任何一个字符。但是可以让它(字符串变量)引用另外一个字符串。

        greeting = greeting.substring(0, 3) + "p!"; //修改字符串变量greeting ,让它引用另外一个字符串
        System.out.println(greeting); //Help!


        //检测字符串是否相等
        //使用equals检测两个字符串是否相等，如果相等，则返回true，否则返回false
        System.out.println(u.equals(greeting)); //false .
        //可以是字符串变量，也可以是常量
        System.out.println("Help!".equals(greeting));//true.

        //注意，一定不能使用==运算符检测两个字符串是否相等。
        String i = "Help!"; // greeting ="Help!"
        System.out.println(i==greeting);//false .
        System.out.println(i=="Help!" );//true .
        //如果虚拟机始终将相同的字符串共享，就可以使用==运算符检测是否相等。
        //但实际上，只有字符串常量是共享的，而+或substring等操作产生的结果并不是共享的。

        //因此千万不要使用 == 运算符

        //构建字符串 StringBuilder

        //如果需要用许多小段的字符串构建一个字符串，应该使用StringBuilder
        StringBuilder builder = new StringBuilder(); // 构建一个空的字符串构建器。
        builder.append("Hello"); //每次需要添加一部分内容时，就调用append方法
        System.out.println(builder); //Hello
        builder.append("World");
        System.out.println(builder); //HelloWorld

        String completedString = builder.toString(); // 在需要构建字符串时就调用toString方法，将可以得到一个String对象。
        System.out.println(completedString); //HelloWorld1
        System.out.println(builder); //HelloWorld
        //System.out.println(completedString==builder); //Error:(76, 43) java: 不可比较的类型: java.lang.String和java.lang.StringBuilder
        // System.out.println(completedString.equals(builder));//false . 两个相比较的类型并不相等，即使值相等也会报错。更可能是一个bug

        //其他应用
        //返回所构建字符串的长度
        System.out.println(builder.length()); //10 length() 返回构建器或缓冲器中的代码单元数量

        //追加一个代码点，并将其转换为一个或两个代码单元并返回this
        System.out.println(builder.appendCodePoint(65)); //HelloWorldA，还记得65是什么吗？

        //StringBuilder setCharAt(int i,char c) 将第i个代码单元设置为c
        builder.setCharAt(3, 'p');
        builder.setCharAt(4, '!');
        System.out.println(builder); //Help!WorldA

        //StringBuilder insert(int i,String s) ,在i位置插入一个字符串并返回this
        builder.insert(5, "My");
        System.out.println(builder); //Help!MyWorldA









    }
}
