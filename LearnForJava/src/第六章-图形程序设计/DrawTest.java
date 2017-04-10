import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

/**
 * Created by scric on 2017/4/10.
 * @since 这是一个画画测试
 */
public class DrawTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new DrawFrame();
                frame.setTitle("DrawTest");
                frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}

// 添加一个框架
class DrawFrame extends JFrame {
    DrawFrame() {
        add(new DrawComponent());
        pack();
    }
}

//添加一个组件
class DrawComponent extends JComponent {
    private static final int DEFAULT_WIDTH = 400;
    private static final int DEFAULT_HEIGHT = 400;

    public void paintComponent(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics;  // 类型转换, 将 graphics 转换成 graphics2D

        //画矩形
        //矩形位置
        double leftX = 100;
        double topY = 100;
        //矩形大小(rectangle)
        double width = 200;
        double height = 150;

        Rectangle2D rectangle2D = new Rectangle2D.Double(leftX, topY, width, height);
        graphics2D.draw(rectangle2D);

        //画椭圆(enclosed ellipse)

        Ellipse2D ellipse2D = new Ellipse2D.Double();
        ellipse2D.setFrame(rectangle2D);
        graphics2D.setColor(Color.gray);
        graphics2D.fill(ellipse2D);

        //画一个对角线(diagonal line)
        graphics2D.draw(new Line2D.Double(leftX, topY, leftX + width, topY + height));

        //画一个圆
        double centerX = rectangle2D.getCenterX();
        double centerY = rectangle2D.getCenterY();
        double radius = 150;  //半径

        Ellipse2D circle = new Ellipse2D.Double();
        circle.setFrameFromCenter(centerX, centerY, centerX + radius, centerY + radius);
//        graphics2D.setColor(Color.cyan);
//        graphics2D.fill(circle);
        graphics2D.draw(circle);
    }

    //组件的大小
    public Dimension getPreferredSize() {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}
