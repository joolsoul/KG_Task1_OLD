package ru.vsu.kudinov_i_m.scenery;

import java.awt.*;

public class Tree
{
    public Tree(Graphics2D gr, int x1, int x2, Color color)
    {
        drawTree(gr, x1, x2, color);
    }

    private void drawTree(Graphics2D gr, int x1, int x2, Color color)
    {
        int width = x2 - x1;
        int middle = x1 + width/2;
        double height = width * 1.5;

        int[] x = {x1, (int) (middle - width/3.7), (int) (middle - width/2.4), (int) (middle - width/5.3), (int) (middle - width/3.4), middle - width/8, (int) (middle - width/4.4), middle,(int) (middle + width/4.4), middle + width/8, (int) (middle + width/3.4), (int) (middle + width/5.3), (int) (middle + width/2.4), (int) (middle + width/3.7), x2};
        int[] y = {560, 560 - (int) (height/4.5), 560 - (int) (height/4.5), 560 - (int) (height/2.25), 560 - (int) (height/2.25), 560 - (int) (height/1.5), 560 - (int) (height/1.5), 560 - (int) height, 560 - (int) (height/1.5), 560 - (int) (height/1.5), 560 - (int) (height/2.25), 560 - (int) (height/2.25), 560 - (int) (height/4), 560 - (int) (height/4), 560};

        gr.setPaint(color);
        gr.fillPolygon(x, y, 15);

        gr.setPaint(new Color(0x60A39C));
        gr.setStroke(new BasicStroke(2));
        gr.drawLine(middle, 558, middle, 564 - (int) height);
        gr.drawLine(middle, (int) (560 - height/5.2), middle - width/4, 560 - 10);
        gr.drawLine(middle, (int) (560 - height/5.2), middle + width/4, 560 - 10);

        gr.drawLine(middle, (int) (560 - height/2.3), (int) (middle - width/5.3), (int) (560 - height/4.5));
        gr.drawLine(middle, (int) (560 - height/2.3), (int) (middle + width/5.3), (int) (560 - height/4.5));

        gr.drawLine(middle, (int) (560 - height/1.6), (int) (middle - width/6.9), (int) (560 - height/2.1));
        gr.drawLine(middle, (int) (560 - height/1.6), (int) (middle + width/6.9), (int) (560 - height/2.1));

        gr.drawLine(middle, (int) (560 - height/1.2), (int) (middle - width/9.6), (int) (560 - height/1.5));
        gr.drawLine(middle, (int) (560 - height/1.2), (int) (middle + width/9.6), (int) (560 - height/1.5));

        gr.drawLine((int) (middle + height/12), (int) (560 - height/3.4), (int) (middle + height/12), (int) (560 - height/4.5));
        gr.drawLine((int) (middle - height/12), (int) (560 - height/3.4), (int) (middle - height/12), (int) (560 - height/4.5));

        gr.drawLine(middle, (int) (560 - height/2.3), (int) (middle + width/4.5), (int) (560 - height/3.3));
        gr.drawLine(middle, (int) (560 - height/2.3), (int) (middle - width/4.5), (int) (560 - height/3.3));

        gr.drawLine((int) (middle - width/10.3), (int) (560 - height/8), (int) (middle - height/10), (int) (560 - height/24));
        gr.drawLine((int) (middle + width/10.3), (int) (560 - height/8), (int) (middle + height/10), (int) (560 - height/24));

        gr.drawLine((int) (middle - width/8), (int) (560 - height/9), (int) (middle - width/4), (int) (560 - height/12));
        gr.drawLine((int) (middle + width/8), (int) (560 - height/9), (int) (middle + width/4), (int) (560 - height/12));

        gr.drawLine((int) (middle - width/12), (int) (560 - height/1.85), (int) (middle - width/12), (int) (560 - height/2.1));
        gr.drawLine((int) (middle + width/12), (int) (560 - height/1.85), (int) (middle + width/12), (int) (560 - height/2.1));

        gr.drawLine((int) (middle - width/24), (int) (560 - height/1.7), (int) (middle - width/6), (int) (560 - height/1.9));
        gr.drawLine((int) (middle + width/24), (int) (560 - height/1.7), (int) (middle + width/6), (int) (560 - height/1.9));

        gr.drawLine((int) (middle - width/16), (int) (560 - height/1.37), (int) (middle - width/16), (int) (560 - height/1.5));
        gr.drawLine((int) (middle + width/16), (int) (560 - height/1.37), (int) (middle + width/16), (int) (560 - height/1.5));

        gr.drawLine((int) (middle - width/24), (int) (560 - height/1.3), (int) (middle - width/6.9), (int) (560 - height/1.4));
        gr.drawLine((int) (middle + width/24), (int) (560 - height/1.3), (int) (middle + width/6.9), (int) (560 - height/1.4));
    }


}
