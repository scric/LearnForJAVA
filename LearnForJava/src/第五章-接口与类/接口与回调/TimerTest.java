package 接口与回调;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.Timer;

/**
 * Created by scric on 2017/3/31.
 * @author scric
 */
public class TimerTest {
    public static void main(String[] args) {

        //构造这个类的一个对象, 并把它传递给 Timer 构造器
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(10000, listener); //单位是毫秒, 第二个参数是 监听器对象
        //启动定时器;
        t.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }

     // 调用接口,当到达指定的时间间隔时, 定时器就调用 actionPerformed 方法
     static class TimePrinter implements ActionListener
     {
        public void actionPerformed(ActionEvent event)
        {
            Date now = new Date();
            System.out.println("At the tone, the time is " + now);
            Toolkit.getDefaultToolkit().beep();
        }

    }

}
