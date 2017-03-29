package Employee类和Manager类测试;

/**
 * Created by scric on 2017/3/26.
 */

public class Manager extends Employee {
    //建立一个私有域
    private double bonus;
    // 创建一个构造器并初始化
    public Manager(String n, double s, int year, int month, int day) {
        super(n, s, year, month, day);
        bonus = 0;
    }
    //重写getSalary

    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double b) {
        bonus = b;
    }

    public String toString(){
        return super.toString() +"[bonus="+bonus+"]";
    }
}
