package ru.vsu.kudinov_i_m.scenery;

import java.awt.*;

public class Cloud
{
    public Cloud(Graphics2D gr)
    {
        drawCloud(gr);
    }

    private void drawCloud(Graphics2D gr)
    {
        int x = getRandomNumeral(20, 1000);
        int y = getRandomNumeral(50, 100);

        gr.setPaint(new Color(0xEDFFFFFF));

        gr.fillArc(x, y + 30, 90, 20 ,0, 360);
        gr.fillArc(x + 70, y + 30, 90, 20 ,0, 360);
        gr.fillArc(x + 140, y + 30, 90, 20 ,0, 360);

        gr.fillArc(x + 40, y + 15, 40, 20 ,0, 360);
        gr.fillArc(x + 60, y, 40, 40 ,0, 360);
        gr.fillArc(x + 80, y - 10, 60, 60 ,0, 360);

        gr.fillArc(x + 150, y + 20, 40, 20 ,0, 360);
        gr.fillArc(x + 130, y, 40, 40 ,0, 360);
    }

    private int getRandomNumeral(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
