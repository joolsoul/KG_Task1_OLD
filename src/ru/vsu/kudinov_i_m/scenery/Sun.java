package ru.vsu.kudinov_i_m.scenery;

import java.awt.*;

public class Sun
{
    public Sun(Graphics2D gr)
    {
        drawSun(gr);
    }

    private void drawSun(Graphics2D gr)
    {
        int x = getRandomNumeral(50, 900);
        gr.setPaint(new Color(0xFFEA91));
        gr.fillOval(x, 20, 100, 100);
    }

    private int getRandomNumeral(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
