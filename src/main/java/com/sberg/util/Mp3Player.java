package com.sberg.util;

import com.sberg.alphabet.model.Letter;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.FactoryRegistry;
import javazoom.jl.player.advanced.AdvancedPlayer;

import java.io.InputStream;
import java.util.List;

public class Mp3Player {

    public static void play(List<Letter> letterList){
        for(Letter tmpLetter: letterList){
            play(tmpLetter);
        }
    }

    public static void play (Letter letter){
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

}
