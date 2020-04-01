package com.sberg;

import java.io.InputStream;
import java.util.List;
import java.util.Random;

import com.sberg.alphabet.icao.IcaoFactory;
import com.sberg.alphabet.model.Letter;
import com.sberg.gui.MainWindow;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.FactoryRegistry;
import javazoom.jl.player.advanced.AdvancedPlayer;


class Hallo {

    private static void play (Letter letter){
        AdvancedPlayer player = null;
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        try {
            InputStream fis = classLoader.getResourceAsStream(letter.getPathToMp3());
            player = new AdvancedPlayer(fis, FactoryRegistry.systemRegistry().createAudioDevice());
        } catch (JavaLayerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(letter.getLetter());
        try {
            player.play();
        } catch (JavaLayerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static int getRandomVal(){
        Random rand = new Random();
        return rand.nextInt(25);
    }

    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow();
        mainWindow.createElements();

        List<Letter> letterList = IcaoFactory.getLetterList();
       for(int i = 0 ; i< 5 ; i++){
           //play(letter);
           play( letterList.get(getRandomVal()));
       }

    }
}
