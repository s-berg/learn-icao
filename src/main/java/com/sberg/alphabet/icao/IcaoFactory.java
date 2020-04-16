package com.sberg.alphabet.icao;

import com.sberg.alphabet.model.Letter;

import java.util.ArrayList;
import java.util.List;

/**
 * Erleichtert das Generieren der Daten fuer die Anwendung
 */

public class IcaoFactory {

    private static List<Letter> letterList;


    public static Letter getLetterForCharacter(List<Letter>letters, char charLetter) {
        for (Letter letterLoop : letters) {
            if (letterLoop.getLetter() == charLetter) {
                return letterLoop;
            }
        }
        return null;
    }
        //TOTO throw NotFoundException

    public static Letter getLetterForChar(char paramChar){
        if(letterList == null){
            letterList = getLetterList();
        }
        for(Letter letterLoop:letterList){
            if(letterLoop.getLetter() == paramChar){
                return letterLoop;
            }
        }
        return null;
    }

    public static List<Letter>getLetterList(){
        if(letterList!= null){
            return letterList;
        }
        letterList = new ArrayList<Letter>();
        letterList.add(new Letter('A', "Alpha", "ICAO/alpha.mp3"));
        letterList.add(new Letter('B', "Bravo", "ICAO/bravo.mp3"));
        letterList.add(new Letter('C', "Charlie", "ICAO/charlie.mp3"));
        letterList.add(new Letter('D', "Delta", "ICAO/delta.mp3"));
        letterList.add(new Letter('E', "Echo", "ICAO/echo.mp3"));
        letterList.add(new Letter('F', "Foxtrot", "ICAO/foxtrot.mp3"));
        letterList.add(new Letter('G', "Golf", "ICAO/golf.mp3"));
        letterList.add(new Letter('H', "Hotel", "ICAO/hotel.mp3"));
        letterList.add(new Letter('I', "India", "ICAO/india.mp3"));
        letterList.add(new Letter('J', "Juliett", "ICAO/juliett.mp3"));
        letterList.add(new Letter('K', "Kilo", "ICAO/kilo.mp3"));
        letterList.add(new Letter('L', "Lima", "ICAO/lima.mp3"));
        letterList.add(new Letter('M', "Mike", "ICAO/mike.mp3"));
        letterList.add(new Letter('N', "November", "ICAO/november.mp3"));
        letterList.add(new Letter('O', "Oscar", "ICAO/oscar.mp3"));
        letterList.add(new Letter('P', "Papa", "ICAO/papa.mp3"));
        letterList.add(new Letter('Q', "Quebec", "ICAO/quebec.mp3"));
        letterList.add(new Letter('R', "Romeo", "ICAO/romeo.mp3"));
        letterList.add(new Letter('S', "Sierra", "ICAO/sierra.mp3"));
        letterList.add(new Letter('T', "Tango", "ICAO/tango.mp3"));
        letterList.add(new Letter('U', "Uniform", "ICAO/uniform.mp3"));
        letterList.add(new Letter('V', "Victor", "ICAO/victor.mp3"));
        letterList.add(new Letter('W', "Whiskey", "ICAO/whiskey.mp3"));
        letterList.add(new Letter('X', "X-Ray", "ICAO/x-ray.mp3"));
        letterList.add(new Letter('Y', "Yankee", "ICAO/yankee.mp3"));
        letterList.add(new Letter('Z', "Zulu", "ICAO/zulu.mp3"));
        return letterList;
    }


}
