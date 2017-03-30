package 对象克隆;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by scric on 2017/3/30.
 * @author scric
 */

public class Employee implements Cloneable { // 实现 Cloneable 接口

    //创建私有域
    private String name;
    private double salary;
    private Date hireDay;


    //创建构造器,并初始化
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        hireDay = new Date();
    }

    //这是一个建立深拷贝的方法 , 感觉就像是 overwride 这个 clone 方法
    public Employee clone() throws CloneNotSupportedException { //将克隆重新定义成 public , 为 Employee 类定义了 clone 方法
        //调用 Object.clone()
        Employee cloned = (Employee) super.clone();

        // 克隆可变字段
        cloned.hireDay = (Date) hireDay.clone();

        return cloned;
    }

    //创建 hireDay 并赋值

    public void setHireDay(int year, int month, int day) {

        Date newHireDay = new GregorianCalendar(year, month - 1, day).getTime();

        hireDay.setTime(newHireDay.getTime());
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;

    }

    public String toString() {
        return "Employee[name = " + name + ", salary = " + salary + ", hireDay = " + hireDay + "]";
    }
}
