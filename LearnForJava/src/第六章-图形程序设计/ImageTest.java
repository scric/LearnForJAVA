import javax.swing.*;
import java.awt.*;

/**
 * Created by scric on 2017/4/12.
 */
public class ImageTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new ImageFrame();
                frame.setTitle("ImageTest");
                frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}

class ImageFrame extends JFrame {
    ImageFrame() {
        add(new ImageComponent());
        pack();
    }
}

class ImageComponent extends JComponent {
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    private Image image;

    ImageComponent() {
        image = new ImageIcon("D:\\Java\\LearnForJava\\src\\第六章-图形程序设计\\blue-ball.gif").getImage(); //在这里要注意用绝对路径来读取图片.
    }

    public void paintComponent(Graphics graphics) {
        if (image == null) {
            return;
        }

        int imageWidth = image.getWidth(this);
        int imageHeight = image.getHeight(this);

        graphics.drawImage(image, 0, 0, null);

        for (int i = 0; i*imageWidth <= getWidth();i++)
            for (int j = 0;j*imageHeight<=getHeight();j++) {
                if (i + j >0) {
                    graphics.copyArea(0, 0, imageWidth, imageHeight, i * imageWidth, j * imageHeight);
                }
            }
    }

    public Dimension getPreferredSize() {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}