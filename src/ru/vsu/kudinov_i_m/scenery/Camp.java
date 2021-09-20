package ru.vsu.kudinov_i_m.scenery;

import java.awt.*;

public class Camp
{
    public Camp(Graphics2D gr)
    {
        drawCamp(gr);
    }

    private void drawCamp(Graphics2D gr)
    {
        int x = getRandomNumeral(0, 180);
        new Tent(gr, x, 360);
        new Tent(gr, x + 250, 360);
        new Tent(gr, x + 600, 360);
        new Campfire(gr, x);
    }

    private int getRandomNumeral(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
