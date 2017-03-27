package Employee类和Manager类测试;

/**
 * Created by scric on 2017/3/26.
 */

import java.util.Date;
import java.util.GregorianCalendar;

public class newEmployee extends Person{

    //创建私有域
    private double salary;
    private Date hireDay;

    //创建构造器,初始化私有域
    public newEmployee(String n, double s, int year, int month, int day) {
        super(n);
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        hireDay = calendar.getTime();
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public String getDescription(){
        return String.format("an employee with a salary of $%.2f", salary);
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }




}

