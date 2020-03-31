import java.io.InputStream;

import com.sberg.alphabet.icao.IcaoFactory;
import com.sberg.alphabet.model.Letter;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.FactoryRegistry;
import javazoom.jl.player.advanced.AdvancedPlayer;


class Hallo {

    private static void play (Letter letter){
        AdvancedPlayer player = null;
        try {
            ClassLoader classLoader = ClassLoader.getSystemClassLoader();
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

    public static void main(String[] args) {
       for(Letter letter: IcaoFactory.getLetterList()){
           play(letter);
       }

    }
}
