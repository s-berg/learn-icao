package com.sberg.gui.comp.hear;

import com.sberg.alphabet.icao.IcaoFactory;
import com.sberg.util.Mp3Player;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HearPanel extends JPanel {

    public HearPanel(){
        super();
        this.createElements();
    }

    public void createElements(){
        JLabel label = new JLabel("Input:");
        JTextField txtField = new JTextField();
        txtField.setSize(50,10);
        JButton btnPlay = new JButton("Play");
        btnPlay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                for(char charLoop: txtField.getText().toUpperCase().toCharArray()) {
                    Mp3Player.play(IcaoFactory.getLetterForChar(charLoop));
                }
            }
        });

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.add(label);
        this.add(txtField);
        this.add(btnPlay);
        //TODO put swing elements here
    }
}
