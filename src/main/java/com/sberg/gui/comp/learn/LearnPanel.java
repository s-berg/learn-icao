package com.sberg.gui.comp.learn;

import com.sberg.alphabet.model.Letter;
import com.sberg.gui.comp.learn.model.LearnTableModel;
import com.sberg.util.Mp3Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

        JPanel rightPanel = new JPanel();
        JButton btnPlay = new JButton("Play");
        rightPanel.setLayout(new GridLayout(1,3));
        rightPanel.add(btnPlay);
        btnPlay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int[] selection = table.getSelectedRows();
                for (int i = 0; i < selection.length; i++) {
                    Mp3Player.play(letters.get(table.convertRowIndexToModel(selection[i])));
                }
            }
        });


        this.setLayout(new BorderLayout());
        this.add(scrollPane, BorderLayout.CENTER);
        this.add(rightPanel, BorderLayout.EAST);

        //TODO put swing elements here
    }
}
