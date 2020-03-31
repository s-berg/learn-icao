import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;

import com.sberg.alphabet.icao.IcaoFactory;
import com.sberg.alphabet.icao.IcaoLetter;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.FactoryRegistry;
import javazoom.jl.player.Player;
import javazoom.jl.player.advanced.AdvancedPlayer;


class Hallo {
    public static void main(String[] args) {
        System.out.println("Welt!!!");

        IcaoLetter alpha = IcaoFactory.getLetterList().get(10);

        AdvancedPlayer player = null;
        try {

            ClassLoader classLoader = ClassLoader.getSystemClassLoader();

            InputStream fis = classLoader.getResourceAsStream(alpha.getPathToMp3());
            player = new AdvancedPlayer(fis, FactoryRegistry.systemRegistry().createAudioDevice());
        } catch (JavaLayerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Starting the music... ");
        try {
            player.play();
        } catch (JavaLayerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
