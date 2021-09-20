package ru.vsu.kudinov_i_m.scenery;

import java.awt.*;

public class Mountains
{
    public Mountains(Graphics2D gr)
    {
        drawMountains(gr);
    }

    private void drawMountains(Graphics2D gr)
    {
        gr.setPaint(new Color(0xF7FBFC));
        int[] xCoordinate = {0, 125, 130, 450, 0};
        int[] yCoordinate = { 200, 80, 80, 560, 560};
        gr.fillPolygon(xCoordinate, yCoordinate, 5);

        int[] xCoordinate2 = {600, 840, 860, 1100};
        int[] yCoordinate2 = {560, 100, 100, 560};
        gr.fillPolygon(xCoordinate2, yCoordinate2, 4);

        gr.fillArc(840, 90, 20, 30, 0, 180);
    }

}
