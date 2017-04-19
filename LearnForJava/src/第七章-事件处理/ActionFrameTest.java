import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Created by scric on 2017/4/17.
 * @author scric
 * @since 较前面的代码不同的是加入了 使用快捷键 .
 * Ctrl y 激活 yellowAction
 * Ctrl b - blueAction
 * Ctrl r - redAction
 * 不仅可以点击按钮来切换背景, 还可以通过快捷键来更换背景
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

        //定义动作, 将动作的名字和图标存储到 下列的动作对象中 (yellowAction..)
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

    //扩展 AbstractAction 类并 实现 actionPerformed 方法
     public class ColorAction extends AbstractAction {
         ColorAction(String name, Icon icon, Color color) {
             putValue(Action.NAME, name);
             putValue(Action.SMALL_ICON, icon);
             // Action.SHORT_DESCRIPTION 工具提示,
             putValue(Action.SHORT_DESCRIPTION, "Set panel color to " + name.toLowerCase());
             putValue("color", color);

             // putValue 和 getValue 方法运行存储和检索动作对象中的任意名/值
             // 有两个重要的预定义字符串, Action.NAME 和 Action.SMALL_ICON . 用于将动作的名字和图标存储到一个动作对象中
         }

         //重写方法
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
