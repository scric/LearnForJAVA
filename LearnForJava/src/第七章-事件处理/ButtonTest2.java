import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by scric on 2017/4/13.
 * @version 2.0
 * @author scric
 * @since 这是改良版的设置背景, 使用匿名内部类来实现简化的功能.
 */
public class ButtonTest2 {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new ButtonFrame2();
                frame.setTitle("ButtonTest2");
                frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}

class ButtonFrame2 extends JFrame{

    private JPanel buttonPane2;
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 2000;

    ButtonFrame2() {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        buttonPane2 = new JPanel();

        makeButton("yellow", Color.yellow);
        makeButton("blue", Color.blue);
        makeButton("red", Color.red);
        add(buttonPane2);
    }
    private void makeButton(String name, final Color backgroundColor){

        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        JButton button = new JButton(name);
        buttonPane2.add(button);
        button.addActionListener(e -> buttonPane2.setBackground(backgroundColor));
    }
//    class ColorAction implements ActionListener {
//        private Color backgroundColor;
//
//        ColorAction(Color color) {
//            backgroundColor = color;
//        }
//
//        public void actionPerformed(ActionEvent event) {
//            buttonPane1.setBackground(backgroundColor);
//        }
//
//    }
}