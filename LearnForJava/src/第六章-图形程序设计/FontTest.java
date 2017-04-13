import javax.swing.*;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

/**
 * Created by scric on 2017/4/10.
 */
public class FontTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new FontFrame();
            frame.setTitle("FontTest");
            frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            frame.setVisible(true);
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

    private static final int DEFAULT_WIDTH = 1080;
    private static final int DEFAULT_HEIGHT = 2560;

    public void paintComponent(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics;

        String message = "Hello, World!";

        // 这是字体的设置
        // 使用某种字体绘制字符 : 字符名, 字体风格, 字体大小
        Font font = new Font("Serif", Font.BOLD, 36);  // 创建一个 Font 类对象并构造
        graphics2D.setFont(font);

        ///得到屏幕设备字体属性的描述对象.
        FontRenderContext context = graphics2D.getFontRenderContext();
        Rectangle2D bounds = font.getStringBounds(message, context);  // getStringBounds() 方法将返回包围字符串的矩形

        // 设置矩形的大小
        double x = (getWidth() - bounds.getWidth()) / 2;  // 获得字符串的宽度
        double y = (getHeight() - bounds.getHeight()) / 2; // 获得字符串的高度

        double ascent = -bounds.getY();  // 获得字符串的上坡度
        double baseY = y + ascent;

        // 显示字符串
        graphics2D.drawString(message, (int) x, (int) baseY);
        graphics2D.setPaint(Color.LIGHT_GRAY);

        graphics2D.draw(new Line2D.Double(x, baseY, x + bounds.getWidth(), baseY));
        Rectangle2D rectangle2D = new Rectangle2D.Double(x, y, bounds.getWidth(), bounds.getHeight());
        graphics2D.draw(rectangle2D);
    }
    public Dimension getPreferredSize() {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}