package 内部类;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * Created by scric on 2017/3/31.
 * @author scric
 */
public class innerClassTest {
    public static void main(String[] args) {

        TalkingClock clock = new TalkingClock(1000, true);
        clock.strat();

        JOptionPane.showMessageDialog(null, "Quit program");
        System.exit(0);

    }

    //从上节课的例子中抽象出一个 TalkingClock 类,
    //构造一个语音时钟需要提供两个参数: 发布通告的间隔和开关铃声的标记

    public static class TalkingClock {
        private int interval;
        private boolean isBeep;


        public TalkingClock(int interval, boolean isBeep) {
            this.interval = interval;
            this.isBeep = isBeep;
        }

        public void strat(){
            ActionListener listener = new TimePrinter();
            Timer t = new Timer(interval, listener);
            t.start();
        }


        public class TimePrinter implements ActionListener {



            //一个内部类
            public void actionPerformed(ActionEvent event) {
                Date now = new Date();
                System.out.println("At the tone, the time is " + now);
                if (isBeep) Toolkit.getDefaultToolkit().beep();
            }

            /**
             * 在这里, 说明一下这个概念 ,我们将外围类对象的引用称为outer , 于是上面的 actionPerformed 可以等价于
//            public void actionPerformed(ActionEvent event) {
//                Date now = new Date();
//               rdSystem.out.println("At the tone, the time is " + now);
//                if (outer.beep) Toolkit.getDefaultToolkit().beep();
//            }
             */
        }



    }



}
