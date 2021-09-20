package ru.vsu.kudinov_i_m.scenery;

import java.awt.*;

public class Tent
{
    public Tent(Graphics2D gr, int x, int y)
    {
        drawTent(gr, x, y);
    }

    private void drawTent(Graphics2D gr, int x, int y)
    {
        gr.setPaint(new Color(0xD4732F));
        int[] xCoordinate = {x, x + 150, x + 150};
        int[] yCoordinate = {560, y, 560};
        gr.fillPolygon(xCoordinate, yCoordinate, 3);
        gr.setStroke(new BasicStroke(3));
        gr.drawLine(x + 149, y + 1, x + 149, y - 40);

        gr.setPaint(new Color(0x9A4D23));
        xCoordinate = new int[]{x + 150, x + 150, x + 300};
        gr.fillPolygon(xCoordinate, yCoordinate, 3);
        gr.setStroke(new BasicStroke(3));
        gr.drawLine(x + 149, y + 1, x + 130, y - 30);
        gr.drawLine(x + 149, y + 1, x + 169, y - 30);

        gr.setPaint(new Color(0x562A11));
        xCoordinate = new int[]{x + 100, x + 150, x + 200};
        yCoordinate = new int[]{y + 200, y + 140, y + 200};
        gr.fillPolygon(xCoordinate, yCoordinate, 3);

        gr.setPaint(new Color(0xCFCBA6));
        xCoordinate = new int[]{x + 98, x + 148, x + 83};
        yCoordinate = new int[]{y + 200, y + 140, y + 180};
        gr.fillPolygon(xCoordinate, yCoordinate, 3);

        gr.setPaint(new Color(0xCFCBA6));
        xCoordinate = new int[]{x + 152, x + 202, x + 217};
        yCoordinate = new int[]{y + 140, y + 200, y + 180};
        gr.fillPolygon(xCoordinate, yCoordinate, 3);
    }
}
