/**
 * Created by scric on 2017/3/18.
 * @version 1.0
 * @author scric
 */




import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Scanner; // 导入Scanner类
import java.io.*;

public class InAndOut_Put {
    public static void main(String[] args) throws IOException {
        // 输入与输出。

        //为了使程序能够接收输入并以适当的格式输出，

        //读取输入
//        Scanner in = new Scanner(System.in); //构建一个Scanner类，并与"标准输入流"System.in关联
//        //读取一行
//        System.out.println("What is your name?");//zhang xin
//        String name = in.nextLine(); // nextLine方法将输入一行，而且可能在输入行中有可能包含空格.
//        System.out.println("My name is：" + name);//zhang xin
//        //读取一个单词(以空格为分隔符)
//        System.out.println("What is your name?"); //zhang xin
//        String aname = in.next(); // 读取一个单词，以空白符作为分隔符。
//        System.out.println("Your name is：" + aname); //Your name is：zhang
//        //读取一个整数
//        System.out.println("How old are you?");
//        int age = in.nextInt();//在这里如果第二个输入函数还是按zhang xin 输入，则nextInt则会读取到x而与所要输入的格式不符，所以会报错。
//        System.out.println("我已经" + age + "岁");
//
//        System.out.println("My name is " + name + ",My age is " + age);


        //因为输入是可见的，所以Scanner类不适合用于从控制台读取密码
        //所以引入了Console类实现这个目的。
//        Console cons = System.console();
//        String username = cons.readLine("User name：");
//        char[] password = cons.readPassword("Password:");
        //java.io.Console 只能用在标准输入、输出流未被重定向的原始控制台中使用，在 Eclipse 或者其他 IDE 的控制台是用不了的。故不详细讲。


//        //格式化输出
//        //使用System.out.print(x)将数值x输出到控制台上。这条命令将以x对应的数据类型所允许的最大非0数字位数打印输出x.
//        double x = 10000.0 / 3.0;
//        System.out.println(x); //3333.3333333333335
//        //发现如果想表达精确的值，可能会出现问题。所以java沿用了C语言中的printf方法
//        System.out.printf("%8.2f",x); // 3333.33.打印输出一个空格和7个字符。
//        System.out.println();

        //使用多个参数
//        System.out.printf("Hello,%s. Next year,you'll be %d", name, age); //Hello,zhang xin. Next year,you'll be 10 .
        //每一个以%字符开始的格式说明符都用相应的参数替换。
        // 格式说明符尾部的转换符将指示被格式化的数值类型：f浮点型，s字符串，d十进制整数

        System.out.printf("%,.2f", 10000.0 / 3.0);//添加分组分隔符
        System.out.println();
        System.out.printf("%,(.2f",-10000.0/3.0);//(3,333.33)将负数括在括号内
        System.out.println();
        System.out.printf("|%-8.2f|",10000.0/3.0); //|3333.33 | 左对齐
        System.out.println();
        System.out.printf("|%08.2f|",10000.0/3.0); //|03333.33| 数字前面补0
        System.out.println();

        System.out.printf("%tc",new Date()); //星期日 三月 19 16:09:44 CST 2017 .打印当前时间。
        //关于打印时间的格式，详细请看书。
        System.out.println();
        System.out.printf("%2$tB %2$te, %2$tY","Due date:", new Date()); //Due date: 三月 19, 2017
 //       System.out.printf("%2$tB %3$te, %2$tY","Due date:","zzzzz", new Date());


        //文件输入与输出
//        Scanner in = new Scanner(Paths.get("D:\\Java\\LearnForJava\\第二章-Java的基本程序设计结构\\paper3.txt")); //对文件进行读取

//        PrintWriter out = new PrintWriter("D:\\Java\\LearnForJava\\第二章-Java的基本程序设计结构\\paper3.txt");//写入文件
        //内容在第二卷中详细讲解
    }

}
