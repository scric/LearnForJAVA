//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//
///**
// * Created by scric on 2017/4/17.
// */
//public class ActionFrameTest2 {
//    public static void main(String[] args) {
//        EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                JFrame frame = new ActionFrame2();
//                frame.setTitle("ActionFrameTest2");
//                frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
//                frame.setVisible(true);
//            }
//        });
//    }
//}
//
//class ActionFrame2 extends JFrame {
//    private JPanel buttonPanel2;
//    private static final int DEFAULT_WIDTH = 300;
//    private static final int DEFAULT_HEIGHT = 2000;
//    InputMap inputMap = buttonPanel2.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
//    ActionMap actionMap = buttonPanel2.getActionMap();
//
//    ActionFrame2() {
//        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
//        buttonPanel2 = new JPanel();
//        makeButton("yellow", Color.YELLOW);
//        makeButton("blue", Color.blue);
//        makeButton("red", Color.red);
//
//        add(buttonPanel2);
//    }
//
//    private void makeButton(String name, Color color,String key) {
//        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
//        JButton button = new JButton(name);
//        inputMap.put(KeyStroke.getKeyStroke("ctrl key"), "panel.name");
//        actionMap.put("panel.name", button);
//        buttonPanel2.add(button);
//        button.addActionListener(e -> buttonPanel2.setBackground(color));
//    }
//
//    private void setKeyButton(String key,String name,) {
//
//    }
//}
//
//
//
