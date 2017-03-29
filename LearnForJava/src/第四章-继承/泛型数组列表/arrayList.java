/**
 * Created by scric on 2017/3/27.
 * @version 1.0
 * @since 讲解arrayList的使用
 */
public class arrayList {
    public static void main(String[] args) {


        /*
            //声明和构造一个保存Employee对象的数组列表:
            ArrayList<Employee> staff = new ArrayList<>(); //可以省去右边的类型参数Employee
            //泛型类型为 Employee

            //使用add方法将元素添加到数组列表中
            staff.add(new Employee("Harry Hacker",....));
            staff.add(new Employee(......));
            //如果调用add且内部数组已经满了,数组列表就会自动地创建一个更大的数组,并将所有的对象从较小的数组拷贝到较大的数组中.

            //如果已经清楚或能够估计出数组可能存储的元素数量,可以再填充数组之间调用ensureCapacity方法:
            staff.ensureCapacity(100);//将分配一个包含100个对象的内部数组

            //还可以把初始容量传递给ArrayList构造器
            ArrayList<Employee>staff = new ArrayList<>(100);


            //需要注意的是,数组列表的容量与数组的大小有一个重要的区别.
            //如果为数组分配100个元素的存储空间,数组就有100个空位置可以使用,而容量为100个元素的数组列表只是拥有保存100个元素的潜力
            //但是在最初,甚至完成初始化构造之后,数组列表根本就不含有任何元素

            //size方法将返回数组列7表中包含的实际元素数目
            staff.size();
            //一旦能够确认数组列表的大小不再发生变化.就可以调用trimToSize方法
            这个方法将存储区域的大小调整为当前元素数量所需要的存储空间数目.垃圾回收器将回收多余的存储空间

            //设置第i个元素
            staff.set(i,harry);
            //注意,只有i小于或等于数组列表的大小时才能调用 list.set(i,x)
            //使用 add 方法为数组添加新元素,而不要使用 set 方法,它只能替换数组中已经存在的元素内容.

            //得到数组列表的元素
            Employee e = staff.get(i);
            //注意,在没有泛型类时,原始的ArrayList类提供的get方法别无选择只能返回Object,因此get方法的调用者必须对返回值进行类型转换

           Employee e = (Employee) staff.get(i);

           //下面这个技巧可以一举两得


           //创建一个数组,并添加所有的元素
           ArrayList<X> list = new ArrayList<>();
           while(...){
             x = ...;
             list.add(x);
           }

            X[] a = new X[list.size()];
            list.toArray(a);

            详细信息可以见ArrayListTest中的文件
            */



    }
}
