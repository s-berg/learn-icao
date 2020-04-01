package com.sberg.gui;

import com.sberg.gui.comp.hear.HearPanel;
import com.sberg.gui.comp.learn.LearnPanel;
import com.sberg.gui.comp.listen.ListenPanel;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    JTabbedPane tabbedPane = new JTabbedPane(SwingConstants.TOP);

    LearnPanel learnPanel = new LearnPanel();
    HearPanel hearPanel = new HearPanel();
    ListenPanel listenPanel = new ListenPanel();

    public MainWindow(){
        super();

    }

    public void createElements(){
        JRootPane rootPane = this.getRootPane();

        tabbedPane.add("Learn Tab", learnPanel);
        tabbedPane.add("Hear Tab", hearPanel);
        tabbedPane.add("Listen Tab", listenPanel);

        rootPane.setLayout(new BorderLayout());
        rootPane.add(tabbedPane, BorderLayout.CENTER);

        this.pack();
        this.setVisible(true);
    }
}
