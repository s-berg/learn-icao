package com.sberg.gui.comp.listen;

import com.sberg.alphabet.icao.IcaoFactory;
import com.sberg.alphabet.model.Letter;
import com.sberg.util.Mp3Player;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ListenPanel extends JPanel {

    private List<Letter> letterList;
    public ListenPanel(List<Letter> letterList){
        super();
        this.letterList = letterList;
        this.createElements();
    }

    private void createElements(){
        JLabel label = new JLabel("Inset text to hear it:");
        JTextField textField = new JTextField();
        JButton btnPlay = new JButton("Play");
        btnPlay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = ""+ textField.getText().toUpperCase();
                for(char chLetter: text.toCharArray()){
                    Mp3Player.play(IcaoFactory.getLetterForCharacter(letterList, chLetter));
                }
            }
        });
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        this.add(label);
        this.add(textField);
        this.add(btnPlay);


        //TODO put swing elements here
    }
}
