import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Created by scric on 2017/4/17.
 * @author scric
 * @since 较前面的代码不同的是加入了 使用快捷键 .
 */
public class ActionFrameTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new ActionFrame();
                frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                frame.setTitle("ActionFrameTest");
                frame.setVisible(true);
            }
        });
    }
}

class ActionFrame extends JFrame {
    private JPanel buttonPanel;
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    ActionFrame() {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        buttonPanel = new JPanel();

        //定义动作
        Action yellowAction = new ColorAction("Yellow", new ImageIcon("yellow-ball.gif"), Color.yellow);
        Action blueAction = new ColorAction("Blue", new ImageIcon("blue-ball.gif"), Color.blue);
        Action redAction = new ColorAction("Red", new ImageIcon("red-ball.gif"), Color.red);

        //添加动作到按键上
        buttonPanel.add(new JButton(yellowAction));
        buttonPanel.add(new JButton(blueAction));
        buttonPanel.add(new JButton(redAction));

        //添加面板到框架上
        add(buttonPanel);

        //将快捷键和名字联系起来

        InputMap inputMap = buttonPanel.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        inputMap.put(KeyStroke.getKeyStroke("ctrl Y"), "panel.yellow");
        inputMap.put(KeyStroke.getKeyStroke("ctrl B"), "panel.blue");
        inputMap.put(KeyStroke.getKeyStroke("ctrl R"), "panel.red");

        //将名字和动作联系起来

        ActionMap actionMap = buttonPanel.getActionMap();
        actionMap.put("panel.yellow", yellowAction);
        actionMap.put("panel.blue", blueAction);
        actionMap.put("panel.red", redAction);
    }

     public class ColorAction extends AbstractAction {
         ColorAction(String name, Icon icon, Color color) {
             putValue(Action.NAME, name);
             putValue(Action.SMALL_ICON, icon);
             putValue(Action.SHORT_DESCRIPTION, "Set panel color to" + name.toLowerCase());
             putValue("color", color);
         }
         public void actionPerformed(ActionEvent event) {
             Color color = (Color) getValue("color");
             buttonPanel.setBackground(color);
         }
    }

//
//    private void makeButton(String name, ImageIcon icon, Color color) {
//        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
//        Action action = new ColorAction(name, icon, color);
//        buttonPanel.add(action);
//
//    }


}
