/**
 * Created by scric on 2017/3/21.
 * @version 1.0
 * @author scric
 *
 */

import java.util.Date;
public class Class {
    public static void main(String[] args) {

        System.out.println(new Date());//Tue Mar 21 10:38:58 CST 2017 .输出当前时间.
        //new Date() 这个表达式构造了一个新对象.这个对象被初始化为当前的日期和时间.

        String date = new Date().toString(); //将toString方法应用到新创建的Date()对象上,并赋值给String类型的date变量
        System.out.println(date);//Tue Mar 21 10:41:07 CST 2017

        //如果希望构造的对象可以多次使用,需要将对象存放在一个变量中.
        Date birthday = new Date(); // 新构造的对象变量birthday引用了Date类型的对象

        Date deadline; // 定义了一个对象变量deadline,但是,变量deadline不是一个对象,此刻也没有引用对象.所以不能讲任何Date方法应用于这个变量上
        //date = deadline.toString();//Error:(22, 16) java: 可能尚未初始化变量deadline . 报错

        //所以我们应该初始化变量deadline
        //deadline = new Date(); //用新构造的对象初始化这个变量
        deadline = birthday; // 引用一个已存在的对象
        System.out.println(deadline.toString()); //Tue Mar 21 10:51:17 CST 2017
        //以上两种方法都ok

        //需要注意的是,一个对象变量并没有实际包含一个对象,而仅仅只是引用一个对象.
        //所以在deadline = new Date()中,表达式new Date()构造了一个Date类型的对象,并且它的值是对新创建对象的引用.这个引用存储在变量deadline中.

        //如果想了解详细的获得时间代码.可以看CalendarTest.java

        //用户自定义类.
        //详细可看 EmployeeTest.java

      System.out.println(Math.PI); //3.1415926
//        Math math = new Math();
//        System.out.println(math.PI); //Error:(39, 21) java: 无法从静态上下文中引用非静态 变量 this
    }
    //静态常量
    public  class Math {
       public static final double PI =3.1415926;
      //  public final double PI = 3.1415926; //Error:(38, 32) java: 无法从静态上下文中引用非静态 变量 PI
        //如果static被忽略,PI就变成了Math类的一个实例域.需要通过Math类的对象访问PI
        //但是为什么我并不能够创建Math类对象呢?提示class.this 不能通过一个static类
        //这就引出了静态方法.因为当前的类并不是静态的,所以其对象PI并不是静态的.我们应该怎么改呢?
        //只需在类的public后加入 static即可.
    }

    //静态方法
    //静态方法就是一种不能向对象实施操作的方法,比如Math类的pow方法..

    //也可以静态方法是没有this参数的方法(在一个非静态的方法中,this参数表示这个方法的隐式参数.)


}
