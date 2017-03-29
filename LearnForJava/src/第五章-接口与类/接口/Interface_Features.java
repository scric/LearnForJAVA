package 接口;

/**
 * Created by scric on 2017/3/29.
 * @version 介绍接口的特性
 */
public class Interface_Features {
    public static void main(String[] args) {

        // 接口不是类, 不能使用 new 运算符实例化一个接口:
        // x = new Comparable<>(); //Error:(9, 13) java: java.lang.Comparable是抽象的; 无法实例化

        //声明接口的变量
        Comparable x; // it work

        //接口变量必须引用实现了接口的类对象.
        x = new Employee("张鑫", 80000); //接口变量必须引用实现了接口的类对象

        System.out.println(x); // 接口.Employee@74a14482



    }
}

