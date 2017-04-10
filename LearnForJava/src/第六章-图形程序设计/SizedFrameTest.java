import javafx.embed.swing.JFXPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by scric on 2017/4/6.
 */
public class SizedFrameTest
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run()
            {
                JFrame frame = new SizedFrame();
                frame.setTitle("SizdFrame");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}

class SizedFrame extends JFrame
{
    //建立一个构造器并将其初始化
    public SizedFrame()
    {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();

        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;


        setSize(screenWidth / 2, screenHeight / 2);

        setLocationByPlatform(true);

        Image img;
        img = new ImageIcon("icon").getImage();  //为什么图像并没有加载进去?
        setIconImage(img);
    }
}