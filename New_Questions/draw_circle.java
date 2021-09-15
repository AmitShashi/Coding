package New_Questions;

import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Color;

public class draw_circle extends JFrame
{
    public draw_circle()
    {
        setTitle("Tutorial");
        setSize(960,960);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.GREEN);
        g.drawOval(480,480,200,200);
        g.fillOval(480, 480, 200, 200);
    }

    public static void main(String[] args)
    {
        draw_circle t = new draw_circle();
        t.paint(null);
    }
}