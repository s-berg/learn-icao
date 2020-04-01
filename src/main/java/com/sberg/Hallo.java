package com.sberg;

import java.io.InputStream;
import java.util.List;
import java.util.Random;

import com.sberg.alphabet.icao.IcaoFactory;
import com.sberg.alphabet.model.Letter;
import com.sberg.gui.MainWindow;
import com.sberg.util.Mp3Player;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.FactoryRegistry;
import javazoom.jl.player.advanced.AdvancedPlayer;


class Hallo {

    public static int getRandomVal(){
        Random rand = new Random();
        return rand.nextInt(25);
    }

    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow(IcaoFactory.getLetterList());
    }
}
