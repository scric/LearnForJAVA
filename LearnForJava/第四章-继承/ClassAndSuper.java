/**
 * Created by scric on 2017/3/26.
 * @author scric
 * @version 1.0
 * @since 讲解类,超类,子类间的关系.
 */
public class ClassAndSuper {
    public static void main(String[] args) {

        /*
           回想一下上节的内容.我们知道经理的待遇和普通员工的待遇肯定不一样,但他们也存在相同的地方.
           比如,他们都领取薪水,但是普通员工仅仅领取薪水,而经理还可以得到奖金.
           这种时候就应该使用继承.我们可以重写Employee类中已经编写的所有代码,并将其中的所有域保留下来.

           从理论上讲, Manager 与Employee之间存在 "is a" 的关系,因为每一个经理都是一名雇员:"is a "关系是继承的一个明显特征

           class Manager extends Employee
           {
              添加方法和域
           }

           关键词extend表示继承 ,表明正在构造的新类派生于一个已存在的类.

           已存在的类称为超类(superclass),基类(baseclass)或父类(parentclass)
           新类称为子类(subclass),派生类(derivedclass)或孩子类(childclass)
           超类和子类是Java程序员最常用的两个术语

           尽管Employee类是一个超类,但是子类比超类拥有的功能更加丰富,Manager类比超类Employee封装了更多的数据,拥有更多的功能.

           比如
           class Manager extends Employee
           {
              private double bonus; //增加了一个用于存储奖金的域
              ....
              public void setBonus(double b)  //增加一个用于设置这个域的方法
              {
                 bonus = b ;
              }
           }

           需要注意的是,  虽然Manager类中没有显式地定义getName和getHireDay等方法,但属于Manager类的对象却可以使用它们.因为Manager类自动地继承了超类Employee中的方法

           还有 setBonus方法不是在Employee类中定义的,所以属于Employee类的对象不能使用它.

           也就是说.
           应该将通用的方法放在超类中,而将具有特殊用途的方法放在子类中.

           但是超类中的有些方法对子类Manager并不一定使用.比如Manager类中的getSalary方法应该返回薪水和奖金的总和.
           所以应该提供一个新的方法来覆盖(override)超类中的这个方法(作用在子类上)
             class Manager extends Employee
           {
              private double bonus; //增加了一个用于存储奖金的域
              ....
              public void setBonus(double b)  //增加一个用于设置这个域的方法
              {
                 bonus = b ;
              }

              public double getSalary(){
                  double baseSalary = super.getSalary(); // super:指示编译器调用超类方法的特殊关键词
                  return baseSalary + bonus;
              }
           }

           注意.在覆盖方法的时候,不能直接return salary + bonus .
           因为Manager类的getSalary方法不能够直接地访问超类的私有域salary,只有Employee类的方法(getSalary)才能够访问私有部分

           也不能够直接调用getSalary方法.因为Manager类中也有一个getSalary方法,这条语句会无限制地调用自己,从而导致崩溃.

           看一下super在构造器中的应用

           public Manager(String n ,double s,int year, int month, int day)
           {
               super(n,s,year,month,day); // "调用超类中含有n,s,year,month,day参数的构造器"
               bonus = 0;

           }
           因为Manager类的构造器不能访问超类的私有域,所以必须利用超类的构造器对这部分私有域进行初始化?(为什么要将它初始化呢?),


           详情可以看Employee类和Manager类测试

         */

    }
}
