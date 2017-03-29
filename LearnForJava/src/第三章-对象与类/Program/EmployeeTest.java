import java.util.*;

/**
 * This program tests the Employee class.
 * @version 1.11 2004-02-19
 * @author Cay Horstmann
 */
public class EmployeeTest
{
   public static void main(String[] args)
   {
      // fill the staff array with three Employee objects
      Employee[] staff = new Employee[3];

      staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
      staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
      staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

      // raise everyone's salary by 5%
      for (Employee e : staff)
         e.raiseSalary(5); //e是隐式对象.详情见最下

      // print out information about all Employee objects
      for (Employee e : staff)
         System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay="
               + e.getHireDay());
   }
}

class Employee {
   //下面三个实例用来存放将要操作的数据 .private确保只有Employee类自身的方法能够访问这些实例域,而其他类的方法不能够读写这些域.
   private String name; //name域是String类对象  .是一个只读域  ,也可以将实例域定义为final .private final String name;
   //final 修饰符大都应用于基本(primitive)类型域或不可变(immitable)类的域(类中的方法不会改变其对象)
   private double salary;//基本类型 ,可以用raiseSalary方法修改.
   private Date hireDay;//hireDay是Date类对象


   //下面是Employee类的构造器

   public Employee(String n, double s, int year, int month, int day) // 构造器与类同名
   {
      name = n;  //不要在构造器中定义与实例域重名的局部变量.比如 String name = n;
      salary = s;
      GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
      // GregorianCalendar uses 0 for January
      hireDay = calendar.getTime();
   }

   //封装的优点

   public String getName() {
      return name;
   } //只返回实例域值,称为域访问器

   public double getSalary() {
      return salary;
   }

   public Date getHireDay() {
      return hireDay;
   } // 注意不要编写返回引用可变对象的访问器方法 // Date是可变对象.






   //raiseSalary方法有两个参数.第一个参数是隐式参数(implicit)参数,是出现在方法名前的Employee类对象
   //第二个参数位于方法名后面括号中的数值,这是一个显式对象(explicit)
   // 在每一个方法中,关键词this表示隐式参数.


   public void raiseSalary(double byPercent) {
      double raise = salary * byPercent / 100;
      salary += raise; // this.salary += raise; //也是可以的,这样可以将实例域与局部变量明显地区分开来.
   }
}
