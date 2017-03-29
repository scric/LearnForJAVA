package 对象克隆;

import 接口.Employee;

/**
 * Created by scric on 2017/3/29.
 * @since 拷贝变量的影响
 */
public class testForCopy {
    public static void main(String[] args) {

        //初始化
        Employee original = new Employee("张鑫", 50000);
        Employee copy = original;

        System.out.println("---改变前---");
        System.out.println(original.getName() + " " + original.getSalary());
        System.out.println(copy.getName() + " " + copy.getSalary());

        copy.raiseSalary(10);

        System.out.println("---改变后---");
        System.out.println(original.getName() + " " + original.getSalary());
        System.out.println(copy.getName() + " " + copy.getSalary());


    }

}

