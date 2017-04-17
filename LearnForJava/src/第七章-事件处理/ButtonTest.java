import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by scric on 2017/4/13.
 *
 */
public class ButtonTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new ButtonFrame();
                frame.setTitle("ButtonTest");
                frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}

 class ButtonFrame extends JFrame {
    private JPanel buttonPane1;
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

     ButtonFrame() {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        //这是按钮构造器, 并进行了初始化
        JButton yellowButton = new JButton("Yellow");
        JButton blueButton = new JButton("Blue");
        JButton redButton = new JButton("Red");

        buttonPane1 = new JPanel(); // 在 JFrame 面板上 new 一个 JPanal 面板, 并初始化为 buttonPane1

        //将 按钮 添加到 buttonPane1 面板中
        buttonPane1.add(yellowButton);
        buttonPane1.add(blueButton);
        buttonPane1.add(redButton);

        //将 buttonPane1 面板添加到 JFrame 面板中
        add(buttonPane1);


        // 创建按钮动作构造器并初始化
         ColorAction yellowAction = new ColorAction(Color.YELLOW);
         ColorAction blueAction = new ColorAction(Color.blue);
         ColorAction redAction = new ColorAction(Color.red);

         // 将动作和按钮关联起来 .(在按钮上添加动作)
         yellowButton.addActionListener(yellowAction);
         blueButton.addActionListener(blueAction);
         redButton.addActionListener(redAction);
    }

    private class ColorAction implements ActionListener {
        private Color backgroundColor;

        ColorAction(Color color)
        {
            backgroundColor = color;
        }

        public void actionPerformed(ActionEvent event)
        {
            buttonPane1.setBackground(backgroundColor);
        }

    }
}

