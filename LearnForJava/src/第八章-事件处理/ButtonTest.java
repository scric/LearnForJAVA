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

        JButton yellowButton = new JButton("Yellow");
        JButton blueButton = new JButton("Blue");
        JButton redButton = new JButton("Red");

        buttonPane1 = new JPanel();

        buttonPane1.add(yellowButton);
        buttonPane1.add(blueButton);
        buttonPane1.add(redButton);

        add(buttonPane1);

         ColorAction yellowAction = new ColorAction(Color.YELLOW);
         ColorAction blueAction = new ColorAction(Color.blue);
         ColorAction redAction = new ColorAction(Color.red);

         yellowButton.addActionListener(yellowAction);
         blueButton.addActionListener(blueAction);
         redButton.addActionListener(redAction);
    }

    private class ColorAction implements ActionListener {
        private Color backgroundColor;

        ColorAction(Color color) {
            backgroundColor = color;
        }

        public void actionPerformed(ActionEvent event) {
            buttonPane1.setBackground(backgroundColor);
        }

    }
}

