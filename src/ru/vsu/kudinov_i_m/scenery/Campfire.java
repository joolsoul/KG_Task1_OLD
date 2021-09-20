package ru.vsu.kudinov_i_m.scenery;

import java.awt.*;

public class Campfire
{
    public Campfire(Graphics2D gr, int x)
    {
       drawCampfire(gr, x);
    }

    private void drawCampfire(Graphics2D gr, int x)
    {
        gr.setPaint(new Color(0x4E483C));
        gr.fillRoundRect(x + 550, 545, 70, 15, 10, 10);

        gr.setPaint(new Color(0x898375));
        gr.fillOval(x + 550, 545, 10, 15);

        gr.setPaint(new Color(0xF2AD24));
        int[] xCoordinate = {x + 560, x + 550, x + 555, x + 547, x + 552, x + 545, x + 560, x + 554, x + 573, x + 585, x + 597, x + 616, x + 610, x + 625, x + 618, x + 623, x + 615, x + 620, x + 605};
        int[] yCoordinate = {545, 535, 535, 527, 527, 508, 519, 493, 507, 480, 507, 493, 519, 508, 527, 527, 535, 535, 545};
        gr.fillPolygon(xCoordinate, yCoordinate, 19);

        for(int i = 0; i < 9; i++)
        {
            xCoordinate[i] +=10;
        }
        for(int i = 10; i < xCoordinate.length - 1; i++)
        {
            xCoordinate[i] -=10;
        }
        for (int i = 1; i < yCoordinate.length - 2; i++)
        {
            yCoordinate[i] +=10;
        }
        gr.setPaint(new Color(0xB6472C));
        gr.fillPolygon(xCoordinate, yCoordinate, 19);

        gr.setPaint(new Color(0xC0BCBC));
        gr.drawArc(x + 545, 400, 100, 100, 90, 150);
        gr.drawArc(x + 500, 390, 100, 100, 300, 90);
        gr.drawArc(x + 530, 380, 100, 120, 300, 90);
    }
}
