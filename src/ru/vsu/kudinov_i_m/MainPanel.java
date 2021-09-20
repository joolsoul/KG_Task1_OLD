package ru.vsu.kudinov_i_m;

import ru.vsu.kudinov_i_m.scenery.*;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel
{
    public MainPanel()
    {

    }

    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D gr = (Graphics2D) g;

        drawBackground(gr);
        new Ice(gr);
        new Sun(gr);
        new Mountains(gr);
        new Cloud(gr);
        new Cloud(gr);

        new Tree(gr,-50, 150, new Color(0x568481));
        new Tree(gr,20, 220, new Color(0x77AAA5));
        new Tree(gr,90, 250, new Color(0x2E5655));
        new Tree(gr,170, 420, new Color(0x588986));
        new Tree(gr,355, 575, new Color(0x5A8784));
        new Tree(gr,295, 495, new Color(0x244C4C));
        new Tree(gr,405, 635, new Color(0x77AAA5));
        new Tree(gr,550, 750, new Color(0x568481));
        new Tree(gr,520, 670, new Color(0x2E5655));
        new Tree(gr,730, 930, new Color(0x77AAA5));
        new Tree(gr,620, 880, new Color(0x386664));
        new Tree(gr,770, 1020, new Color(0x568481));
        new Tree(gr,870, 1100, new Color(0x77AAA5));
        new Tree(gr,870, 1070, new Color(0x244E4D));
        new Tree(gr,950, 1200, new Color(0x568481));

        new Camp(gr);
    }

    private void drawBackground(Graphics2D gr)
    {
        GradientPaint primary1 = new GradientPaint(
                400f, 100f, new Color(204, 233, 239, 255),
                1200f, 900f, new Color(234, 149, 124, 136));
        gr.setPaint(primary1);
        gr.fillRect(0, 0, 1100, 800);

        GradientPaint primary2 = new GradientPaint(
                400f, 100f, new Color(95, 144, 149, 255),
                1200f, 900f, new Color(100, 151, 155, 255));
        gr.setPaint(primary2);
        gr.fillRect(0, 575, 1100, 230);
        gr.setPaint(new Color(0xDEF1F8));
        gr.fillRect(0, 560, 1100, 15);
    }
}
