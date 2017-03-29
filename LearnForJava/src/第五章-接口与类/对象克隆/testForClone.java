package 对象克隆;

import 接口.Employee;

/**
 * Created by scric on 2017/3/29.
 * @since clone 方法的使用
 */
public class testForClone {
    public static void main(String[] args) {

        Employee original = new Employee("张鑫", 80000);
        //Employee copy = original.clone();
        //当我们直接调用 clone 方法时
        //Error:(13, 33) java: clone()可以在java.lang.Object中访问protected
        //Error:(13, 39) java: 不兼容的类型: java.lang.Object无法转换为接口.Employee

    }
}
