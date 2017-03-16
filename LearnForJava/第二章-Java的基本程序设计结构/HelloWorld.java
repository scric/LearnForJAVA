/**
 * Created by scric on 2017/3/16.
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("We will use 'Hello world!'");
    }
}

// 解释

/**
 *

 这个结构虽然非常简单，但是所有的Java应用程序都具有这种结构。

首先，Java对大小写敏感。也就是说你命名的HelloWorld文件和另一个文件 helloworld 是不相同的

所以我们应该注意一下文件的命名问题。还有的是，关键词main，如果将它拼写成 Main，程序是无法运行的。

 关键词解析
 public 是访问修饰符（assess modifier）
 class 表明Java程序中全部内容都包含在类中

 # 类名的命名法则
 类名必须以字母开头，后面可以跟字母和数字的任意组合，无长度限制；但不能使用Java保留字。
 源代码的文件名必须与公共类的名字相同。

 {} 花括号在Java中用来划分程序的各个部分。任何方法的代码都是用 {开始  ，}结束

 需要注意的是 所有的Java程序都必须要有一个main方法

 接下来研究最下面的那行代码，
 System.out.println("We will use 'Hello world!'");

 这里使用了System.out对象并调用了他的println方法。

 . 号用于调用方法。Java使用的通用语法是 object.method(parameters)


 */