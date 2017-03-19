import java.util.Scanner;

/**
 * Created by scric on 2017/3/19.
 * @version 1.0
 * @author scric
 * 内容: 和任何程序设计语言一样，java使用条件语句和循环结构确定控制流程。还有switch语句
 */
public class ControlFlow {
    public static void main(String[] args) {
        //控制流程

        //块作用域
        int n = 2;
        {
            int b = 2;
//       int n = 0; // Error:(15, 17) java: 已在方法 main(java.lang.String[])中定义了变量 n . 不能再嵌套的两个块中声明同名的变量。
            System.out.println(n);
        } //确定了变量b的作用域，只能作用在花括号内
//       System.out.println(n+b); //找不到符号

        //条件语句,详细内容可看中国大学mooc作业的TimeTran

        int big = 10, small = 9;
        if (big > small) { //如果true则实行if花括号中的所有语句，false则实行else花括号中的语句
            System.out.println("big is bigger than small");
        } else if (big == small) {
            System.out.println("big is equal in small");
        } else {
            System.out.println("big is smaller than small");
        }


        //循环
        while (big > small) {
            System.out.println("big is bigger than small");
            small++; //限制条件。
        } //如果不设置限制条件，则该花括号内的语句就会无限循环。如果开始循环条件的值就为false，则循环体一次也不执行


        int count = 0; // 命名一个计数变量
        while (small > big) {
            count+=1; //如果执行一次，则count就会加1
            //输出为空
        }
        System.out.println(count);//0 说明未执行

        //更详细的内容可以看 Program中的Retirement.java(while实现),Retirement2.java(do while实现)

        //for循环

        for (int i = 1; i <= 10; i++) {//第一部分:对计数器初始化;第二部分:给出每次新一轮循环执行前要检查的循环条件;第三部分:指示如何更新计数器
            System.out.print(i + ","); //1,2,3,4,5,6,7,8,9,10, 将数字1到10输出到屏幕，试试将","改为','
        }

        System.out.println("");
        //需要注意的是：for语句的三个部分应该对同一个计数器变量进行初始化，检查和更新

        for (int i=10;i>0;i--){
            System.out.println("Counting down...." + i);
        }
        System.out.println("Blastoff!");

        /**
         * + 在for语句的第一部分中声明了一个变量之后，这个变量的作用域就为for循环的整个循环体
         * + 如果在for语句内部定义一个变量，这个变量就不能再循环体外使用。
         * + 如果希望在for循环体之外使用循环计数器的最终值，应该将这个变量在循环体前面而且在外部声明
         * + 可以在各自独立的不同for循环中定义同名的变量
         */

        //更多详细内容可以看 LotteryOdds.java

        //多重选择:switch语句
        //switch语句将从与选项值相匹配的case标签处开始执行，直到遇到break语句或执行到switch语句的结束处为止

        System.out.println("请输入你所需要的选项（1-3）:");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        switch (option) {
            case 1:
                System.out.println("你真的太棒了");
                break;
            case 2:
                System.out.println("你真的能行吗？");
                break;
            case 3:
                System.out.println("继续努力呀");
                break;
            default:
                System.out.println("再来一次吧");

        }

        //中断流程
        //就向上面的代码一样，break可以用于退出switch语句，也可以用于退出循环语句。这是不带标签的break语句
        //continue.continue语句将控制转移到最外层循环的首部
        int sum = 0, goal = 10;
        while (sum < goal) {
            System.out.println("Enter a number");
            n = sc.nextInt();
            if (n < 0) continue;//如果n<0,则continue忽略当前循环体的剩余部分，立刻调到循环首部{
                sum += n;
            }
        }

    }

