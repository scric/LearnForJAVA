import javax.swing.*; // Swing 类位于 javax.swing 包中. 包名 javax 表示这是一个 java 扩展包, 而不是核心包
import java.awt.*;

/**
 * Created by scric on 2017/4/5.
 * @
 */
public class SimpleFrameTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                SimpleFrame frame = new SimpleFrame();
                // 定义一个用户关闭这个框架时的响应动作.
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                // 显示框架
                frame.setVisible(true);
            }
        });
    }
}

class SimpleFrame extends JFrame {
    // 定义一个子类 SimpleFrame, 它的构造器将框架大小设置为 300 * 200 像素.
    // 在默认情况下, 框架的大小为 0 * 0
    private static final int DEFAULT_WIDTH = 1500;
    private static final int DEFAULT_HEIGHT = 1000;

    public SimpleFrame() {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }

}