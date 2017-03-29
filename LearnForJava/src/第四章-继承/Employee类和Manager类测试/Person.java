package Employee类和Manager类测试;

/**
 * Created by scric on 2017/3/27.
 */
public abstract class Person {
    //定义一个抽象方法
    public abstract String getDescription();

    //创建一个私有域
    private String name;

    //创建一个构造器
    public Person(String n) {
        name = n;
    }

    //创建一个方法返回名字
    public String getName() {
        return name;
    }

}
