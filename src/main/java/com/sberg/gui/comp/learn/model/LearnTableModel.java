package com.sberg.gui.comp.learn.model;

import com.sberg.alphabet.model.Letter;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class LearnTableModel extends AbstractTableModel {

    private List<Letter>letterList = new ArrayList<Letter>();
    private String[] columnNames =  {"Letter", "Letter Name"};

    public LearnTableModel(List<Letter> letters) {
        this.letterList = letters;
    }

    @Override
    public int getRowCount() {
        return letterList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        Letter tmpLetter = this.letterList.get(row);
        if(col == 0){
            return tmpLetter.getLetter();
        }else {
            return tmpLetter.getName();
        }
    }

    @Override
    public String getColumnName(int col) {
        return columnNames[col].toString();
    }
}
