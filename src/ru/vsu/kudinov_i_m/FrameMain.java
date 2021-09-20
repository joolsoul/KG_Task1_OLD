package ru.vsu.kudinov_i_m;

import javax.swing.*;

public class FrameMain extends JFrame
{
    public FrameMain()
    {
        setTitle("Task1");
        setSize(1100, 800);
        add(new MainPanel());
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
