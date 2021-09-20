package ru.vsu.kudinov_i_m.scenery;

import java.awt.*;

public class Ice
{
    public Ice(Graphics2D gr)
    {
        drawIce(gr);
    }

    private void drawIce(Graphics2D gr)
    {
        gr.setPaint(new Color(0xDEF1F8));
        for (int i = 0; i < 15; i++)
        {
            int x = getRandomNumeral(0, 1000);
            int y = getRandomNumeral(580, 790);
            int width = getRandomNumeral(30, 300);
            gr.fillRoundRect(x, y, width, 5, 20, 10);
        }
    }

    private int getRandomNumeral(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
