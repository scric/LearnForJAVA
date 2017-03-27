/**
 * Created by scric on 2017/3/27.
 * @author scric
 * @since 讲解多态的属性和使用
 */
public class Polymorphic {
    public static void main(String[] args) {

        /*
            接着ClassAndSuper代码往下写
            置换法则:

            Employee e;
            e = new Employee(...); //创建一个Employee类对象并被e引用
            e = new Manager(....); //创建一个Manager类对象并被e引用
            可以将一个子类的对象赋给一个超类变量

            在Java语言汇总,对象变量是多态的.一个Employee变量既可以引用一个Employee类对象,也可以引用Employee类的任何一个子类的对象

            在Java中.子类数组的引用可以转换成超类数组的引用,而不需要采用强制类型的转换.

            Manager[] managers = new Manager[10];
            Employee[] staff = managers; //将它转换成Employee[]数组是合法的.

             managers 引用的是 Manager类对象数组
             staff 引用的也是 Manager类对象数组

             如果
             staff[0] = new Employee(...); //出错. 因为我们把一个普通雇员归入到了经理行列了.

             当调用managers[0].setBonus(1000)时,将会导致调用一个不存在的实例域,进而搅乱相邻存储空间的内容.会引发ArryStoreException异常

             在运行的时候,调用e.getSalary()的解析过程:
             1) 首先,虚拟机提取e的实际类型的方法表.既可能是Employee,Manager的方法表,也能是Employee类的其他子类方法表
             2) 接下来,虚拟机搜索定义getSalary签名的类.此时,虚拟机已经知道应该调用哪个方法
             3) 最后,虚拟机调用方法
         */
    }
}
