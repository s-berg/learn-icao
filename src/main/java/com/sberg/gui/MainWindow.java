package com.sberg.gui;

import com.sberg.alphabet.model.Letter;
import com.sberg.gui.comp.hear.HearPanel;
import com.sberg.gui.comp.learn.LearnPanel;
import com.sberg.gui.comp.listen.ListenPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.List;

public class MainWindow extends JFrame implements WindowListener {

    List<Letter> letterList = new ArrayList<Letter>();

    JTabbedPane tabbedPane = new JTabbedPane(SwingConstants.TOP);

    LearnPanel learnPanel;
    HearPanel hearPanel; // = new HearPanel();
    ListenPanel listenPanel;// = new ListenPanel();

    public MainWindow(List<Letter> letterList){
        super();
        this.letterList = letterList;
        createElements();
    }

    private void createElements(){

        learnPanel = new LearnPanel(letterList);
        listenPanel = new ListenPanel(letterList);
        hearPanel = new HearPanel();


        JRootPane rootPane = this.getRootPane();
        tabbedPane.add("Learn Tab", learnPanel);
        tabbedPane.add("Listen Tab", listenPanel);
        tabbedPane.add("Hear Tab", hearPanel);

        rootPane.setLayout(new BorderLayout());
        rootPane.add(tabbedPane, BorderLayout.CENTER);

        this.pack();
        this.setVisible(true);

        this.addWindowListener(this);
    }

    @Override
    public void windowOpened(WindowEvent windowEvent) {
        this.setLocationRelativeTo(null);
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent windowEvent) {

    }

    @Override
    public void windowIconified(WindowEvent windowEvent) {

    }

    @Override
    public void windowDeiconified(WindowEvent windowEvent) {

    }

    @Override
    public void windowActivated(WindowEvent windowEvent) {

    }

    @Override
    public void windowDeactivated(WindowEvent windowEvent) {

    }
}
