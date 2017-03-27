package Employee类和Manager类测试;

/**
 * Created by scric on 2017/3/27.
 */
public class Student extends Person {
    //创建一个私有域
    private String major;

    /**
     * 创建一个构造器,初始化变量
     * @param n the student's name
     * @param m the student's major
     */
    public Student(String n, String m) {
        super(n);  //引用超类的构造器
        major = m;
    }

    //定义具体方法
    public String getDescription(){
        return "a student majoring in" + major;
    }


}
