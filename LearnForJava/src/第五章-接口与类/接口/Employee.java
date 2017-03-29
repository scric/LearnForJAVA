package 接口;

/**
 * Created by scric on 2017/3/29.
 *
 * @version 1.0
 * @since 对一个 Employee 类实例数组进行排序
 */
public class Employee implements Comparable<Employee> {

    //创建私有实例域
    private String name;
    private double salary;

    //创建构造器
    public Employee(String n, double s) {
        name = n;
        salary = s;
    }


    //获取成员变量
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    //创建一个方法用于涨工资
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public int compareTo(Employee other) {
        return Double.compare(salary, other.salary);
    }
}
