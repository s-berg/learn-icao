package com.sberg.gui.comp.learn;

import com.sberg.alphabet.model.Letter;
import com.sberg.gui.comp.learn.model.LearnTableModel;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class LearnPanel extends JPanel {

    public LearnPanel(List<Letter> letters){
        super();
        this.createElements(letters);
    }

    private void createElements(List<Letter> letters){
        JTable table = new JTable();
        table.setModel(new LearnTableModel(letters));
        JScrollPane scrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true);

        this.setLayout(new BorderLayout());
        this.add(scrollPane, BorderLayout.CENTER);

        //TODO put swing elements here
    }
}
