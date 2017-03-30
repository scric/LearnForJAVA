package 对象克隆;

/**
 * Created by scric on 2017/3/30.
 */
public class CloneTest {
    public static void main(String[] args) {
        try {
            Employee original = new Employee("张鑫", 50000);
            original.setHireDay(2000, 1, 1);

            Employee copy = original.clone();

            //更改克隆对象的域值
            copy.raiseSalary(10);
            copy.setHireDay(2002, 12, 31);

            System.out.println("original = " + original);
            System.out.println("copy = " + copy);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //为什么要捕获异常呢?
        //因为 只要在 clone 中含有没有实现 Cloneable 接口的对象, Object 类的 clone 方法就会抛出一个 CloneNotSupportedException 异常,
        // 在这里 Employee 和 Ddate 类都实现了 Cloneable 接口, 因此不会抛出异常
        // 但是编译器并不知道这些情况, 因此需要声明异常
    }
}
