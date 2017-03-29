package Employee类和Manager类测试;

/**
 * Created by scric on 2017/3/26.
 */
public class EmployeeTest {
    public static void main(String[] args) {

        //创建经理对象变量
        Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        //设置奖金
        boss.setBonus(5000);
        //定义一个雇员数组
        Employee[] staff = new Employee[3];

        //将经理和雇员都放在数组中
        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        //输出每个人的薪水
        for (Employee e : staff) {
            //System.out.println(e.getName() + ":" + e.getSalary());//e.getSalary调用能够确定应该执行那个getSalary方法.
            System.out.println(e);
            //尽管将e声明为Employee类型,但它也可以引用Manager类型的对象.

            //一个对象变量(例如变量e)可以指示多种实际类型的现象被称作多态(polymorphism).在运行时能够自动地选择调用哪个方法的现象称为动态绑定(dynamic binding)
        }
    }
}
