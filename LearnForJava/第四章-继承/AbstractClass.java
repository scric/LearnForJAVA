/**
 * Created by scric on 2017/3/27.
 * @author scric
 * @since 介绍抽象类的概念和使用
 */
public class AbstractClass {
    public static void main(String[] args) {

        /*
           学生与雇员都由姓名属性,因此可以将getName方法放置在位于继承关系较高层次的通用超类中.

           现在,再增加一个getDescription方法,它可以返回对一个人的简短描述

           在子类中实现这个方法很容易,但要是在Person类中应该提供什么内容呢?除了姓名以外Person类一无所知.
           这时候我们可以使用 abstract 关键词
           这样就完全不需要在超类中实现这个方法了.

           public abstract String getDescription();

           为了提高程序的清晰度,包含一个或多个抽象方法的类本身必须声明为抽象的.

           abstract class Person{
             public abstract String getDescription();
             .....
           }

           除了抽象方法之外,抽象类还可以包含具体数据和具体方法. 抽象方法在这里充当着占位的作用,它们的具体实现在子类中.

           抽象类不能被实例化, 如果一个类声明为abstract,就不能创建这个类的对象
           new Person("Vince vu")  //that is wrong
           但可以创建一个具体子类的对象
           Person p = new Student("Vince Vu","Economics"); // p是一个抽象类Person的变量,Person引用了一个非抽象子类Student的实例.
           可以定义一个抽象类的对象变量,但是它只能引用非抽象子类的对象.



         */
    }
}
