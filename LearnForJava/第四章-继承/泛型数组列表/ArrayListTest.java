package 泛型数组列表;

import Employee类和Manager类测试.Employee;
import Employee类和Manager类测试.Manager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by scric on 2017/3/27.
 *
 */
public class ArrayListTest {
    public static void main(String[] args) {

        //创建一个泛型数组

        ArrayList<Employee> staff = new ArrayList<>();
        //添加数据

        staff.add(new Employee("Carl", 75000, 1987, 12, 15));
        staff.add(new Employee("Harry Hacker", 50000, 1989, 10, 1));
        staff.add(new Manager("zx", 100000, 1997, 12, 10));

        //如何使用循环改进上面的代码?

        for (Employee e : staff) {
            e.raiseSalary(5);
        }

        for (Employee e : staff) {
            System.out.println(e);
        }
    }
}
