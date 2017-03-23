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
    public class Math {
        public static final double PI = 3.1415926;
        //  public final double PI = 3.1415926; //Error:(38, 32) java: 无法从静态上下文中引用非静态 变量 PI
        //如果static被忽略,PI就变成了Math类的一个实例域.需要通过Math类的对象访问PI
        //但是为什么我并不能够创建Math类对象呢?提示class.this 不能通过一个static类
        //这就引出了静态方法.因为当前的类并不是静态的,所以其对象PI并不是静态的.我们应该怎么改呢?
        //只需在类的public后加入 static即可.
    }

    //静态方法
    //静态方法就是一种不能向对象实施操作的方法,比如Math类的pow方法..

    //也可以静态方法是没有this参数的方法(在一个非静态的方法中,this参数表示这个方法的隐式参数.)
    //因为静态方法不能操作对象,所以不能在静态方法中访问实例域.但是,静态方法可以访问自身类中的静态域
//    class Employee {
//        private static int nextId = 1;
//
//
//        public static int getNextId() {
//            return nextId;  //返回一个静态实例
//        }
//    }
//
//    int n = Employee.getNextId();
    //通过类名调用这个方法

    //详细内容可看StaticTest.java

    //方法参数.
    //考虑下面的调用
    /**
     *    double percent = 10;
     *    harry.raiseSalary(percent); 在这个方法调用之后,percent的值还是10 是什么变化了呢?
     *    如果试图通过一个方法将一个参数值增加3倍
     *
     *    public static void tripleValue(double x) (x是参数变量)
     *    {
     *        x=3*x
     *    }
     *
     *    调用这个方法
     *    double percent = 10;
     *    tripleValue(percent);(percent是方法参数)
     *    sout(percent) //发现这个值还是10
     *
     *    那么其过程是什么呢?
     *    1) x被初始化为percent值的一个拷贝(10)
     *    2) x被乘以3后等于30.但是percent还是10
     *    3)这个方法结束之后,参数变量x被回收
     *
     *   我们可以看到,一个方法不可能修改一个基本数据类型的参数.而对象引用作为参数就可以
     *
     *   public static void tripleSalary(Employee x ) (注意对比上面的代码,看有何不同)
     *   {
     *       x.raiseSalary(200);
     *   }
     *
     *  harry = new Employee(...); 创建一个Employee对象,使变量名为 harry 的变量引用了一个Employee对象,并用这个对象初始化了harry
     *
     *  或者说,表达式 new Employee()构造了一个Employee类型的对象,并且它的值???是对新创建对象的引用.这个引用存储在变量harry中
     *
     *  tripleSalary(harry); //调用方法 .方法参数为harry,需要注意的是,harry并不是一个对象,它只是有一个引用对象 Employee.
     *
     *  一定要认识到,一个对象变量并没有实际包含一个对象,而仅仅引用一个对象
     *
     *  过程:
     *  1)x被初始化为harry值的拷贝,拷贝是对一个对象的引用
     *  2)raiseSalary方法应用于这个对象引用(Employee).x和harry同时引用的那个Employee对象的薪金提高了200%
     *  3)方法结束后,参数变量x被回收,对象变量harry继续引用那个薪金增至三倍的雇员对象
     */


    //为什么说java对对象采用的是"引用调用"这个理解是不对的?
/**
 *     编写一个交换两个雇员对象的方法
 *     public static void swap(Employee x ,Employee y )
 *     {
 *         Employee temp = x ; // temp被赋值为x(对象引用的拷贝)
 *          x= y;
 *          y=temp;
 *     }
 *     Employee a = new Employee("zx",..)
 *     Employee b = new Employee("boss",...)
 *     swap(a,b)
 *     结果并没有改变存储在变量a和 b中的对象引用.swap方法的参数 x和 y被初始化为两个对象引用的拷贝,这个方法交换的是这两个拷贝,而这个拷贝在方法结束时参数变量x和y就被回收了
 *     原来变量 a和 b仍然引用这个方法调用之前所引用的对象.
 *
 *     详细内容可看ParamTest.java
 */


    //对象构造


}
