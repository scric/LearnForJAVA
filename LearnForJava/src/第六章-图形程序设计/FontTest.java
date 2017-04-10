import javax.swing.*;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;

/**
 * Created by scric on 2017/4/10.
 */
public class FontTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new FontFrame();
            }
        });
    }
}

class FontFrame extends JFrame {
    FontFrame() {
        add(new FontComponent());
        pack();
    }
}

class FontComponent extends JComponent {
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    public void paintComponent(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics;

        String message = "Hello, World!";

        // 这是字体的设置
        Font font = new Font("Serif", Font.BOLD, 36);
        graphics2D.setFont(font);

        ///测量这条 message 的大小
        FontRenderContext context = graphics2D.getFontRenderContext();
        Rectangle2D bounds = font.getS

    }
}