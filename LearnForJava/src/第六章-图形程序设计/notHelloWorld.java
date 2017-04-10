import javax.swing.*;
import java.awt.*;

/**
 * Created by scric on 2017/4/10.
 */
public class notHelloWorld {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new notHelloWorldFrame();
                frame.setTitle("notHelloWorld");
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
//修改前
//class notHelloWorldFrame extends JFrame {
//    //创建一个构造器
//    notHelloWorldFrame() {
//        add(new notHelloWorldComponent());
//        pack();
//    }
//}
//修改后
class notHelloWorldFrame extends JFrame {
    notHelloWorldFrame()
    {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
       final int screenHeight = screenSize.height;
       final int screenWidth = screenSize.width;

        setSize(screenWidth / 2, screenHeight / 2);
        setLocationByPlatform(true);

        add(new notHelloWorldComponent());
    }
}

// 填入一个组件, 这个组件用来绘制 String
class notHelloWorldComponent extends JComponent {

    private Toolkit toolkit = Toolkit.getDefaultToolkit();
    private Dimension screenSize = toolkit.getScreenSize();

    private final int screenHeight = screenSize.height;
    private final int screenWidth = screenSize.width;

    //信息的位置
    private final int MESSAGE_X = screenHeight / 3;
    private final int MESSAGE_Y = screenWidth / 8;

    // 窗口的位置
    private  final int DEFAULT_WIDTH =  screenWidth;
    private  final int DEFAULT_HEIGHT =  screenHeight;

    //重写 paintComponent 方法
    public void paintComponent(Graphics graphics)
    {
        graphics.drawString("Not a Hello, World program",MESSAGE_X, MESSAGE_Y);
    }

    // overwriting getPreferredSize 方法
    // 得到组件的大小
    public Dimension getPreferredSize()
    {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}

//上面组件的大小是我们预先设定的, 如果我们想设定一个与当前显示器相符的组件大小呢?
//我们应该修改的 notHelloWorldFrame() 构造器类的值, 将其初始化的值设定为当前显示器的分辨率大小.

//通过修改后的代码我们发现, message 的位置并未发生改变
