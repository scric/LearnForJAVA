package 对象包装器与自动装箱;

/**
 * Created by scric on 2017/3/29.
 */
public class autoPack {
    public static void main(String[] args) {
        Integer a = 1000;
        Integer b = 1000;
        System.out.println(a == b); //false

        //这说明运算符也可以应用在对象包装器对象上,只不过将检测的是对象是否只想同一个存储区域, 所以就算值相同, 等式通常也不会成立

        //但是如果将经常出现的值包装到同一个对象,这种比较久有可能成立.
        //我们可以使用equals方法来比较两个包装器对象

        System.out.println(a.equals(b)); //true

        //使用数值对象包装器还有好处是,可以将数字字符串转换成字符

        String s = "123456";
        int x = Integer.parseInt(s); //这里和Integer对象没有任何关系,parseInt是一个静态方法
        System.out.println(x); //123456

        //注意的是,包装器类不可以用来实现修改数值参数的方法.
        int y = 3;
        triple(y);
        System.out.println(y); //3 数值没有变化

        //如果该用Integer呢?

        Integer z = 3;
        triple2(z);
        System.out.println(z); //3 参数数值同样没有变化
        // 因为Integer对象同样是不可变的,包含在包装器中的内容同样也不可以改变

        // 我们要注意的是, 在上面两段代码中,都是参数的数值没有改变. 但并不意味着我们不能返回一个三倍于参数的数值
        System.out.println(triple3(z)); //9  ,需要注意的是,z的值并没有改变
        System.out.println(z); //3 6

    }

    public static void triple(int x) {
        x = 3 * x;
    }

    public static void triple2(Integer x) {
        x = 3 * x;
    }

    public static int triple3(Integer x) {
        int y = 0;
        return y = 3 * x;
    }
}
