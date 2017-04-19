import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

/**
 * Created by scric on 2017/4/19.
 * @author scric
 * @since 使用鼠标画图
 */
public class MouseTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new MouseFrame();
                frame.setTitle("MouceTest");
                frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}

class MouseFrame extends JFrame {
    MouseFrame() {
        add(new MouseComponent());
        pack();
    }
}

class MouseComponent extends JComponent {
    private static final int SIDELENGTH = 10;
    private ArrayList<Rectangle2D> squares;
    private Rectangle2D current;

    MouseComponent() {
        squares = new ArrayList<>();
        current = null;

        addMouseListener(new MouseHandler());
        addMouseMotionListener(new MouseMotionHandler());

    }

    public void paintComponent(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics;
        for (Rectangle2D rectangle2D : squares) {
            graphics2D.draw(rectangle2D);
        }
    }

    public Rectangle2D find(Point2D point2D) {
        for (Rectangle2D rectangle2D : squares) {
            if (rectangle2D.contains(point2D)) {
                return rectangle2D;
            }
        }
        return null;
    }

    public void add(Point2D point2D) {
        double x = point2D.getX();
        double y = point2D.getY();

        current = new Rectangle2D.Double(x - SIDELENGTH / 2, y - SIDELENGTH / 2, SIDELENGTH, SIDELENGTH);
        squares.add(current);
        repaint();
    }

    public void remove(Rectangle2D s) {
        if (s == null) return;
        if (s == current) {
            current = null;
        }
        squares.remove(s);
        repaint();
    }

    private class MouseHandler extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            current = find(e.getPoint());
            if (current == null) add(e.getPoint());
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            current = find(e.getPoint());
            if (current != null && e.getClickCount() >= 2) {
                remove(current);
            }
        }
    }

    private class MouseMotionHandler implements MouseMotionListener {
        @Override
        public void mouseMoved(MouseEvent e) {
            if (find(e.getPoint()) == null) {
                setCursor(Cursor.getDefaultCursor());
            } else setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
        }

        public void mouseDragged(MouseEvent event) {
            if (current != null) {
                int x = event.getX();
                int y = event.getY();

                current.setFrame(x - SIDELENGTH / 2, y - SIDELENGTH / 2, SIDELENGTH, SIDELENGTH);
                repaint();
            }
        }
    }



}