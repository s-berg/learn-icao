package com.sberg.alphabet.icao;

import java.util.ArrayList;
import java.util.List;

/**
 * Erleichtert das Generieren der Daten fuer die Anwendung
 */

public class IcaoFactory {

    private static List<IcaoLetter> letterList;

    public static List<IcaoLetter>getLetterList(){
        if(letterList!= null){
            return letterList;
        }
        letterList = new ArrayList<IcaoLetter>();
        letterList.add(new IcaoLetter('A', "Alpha", "ICAO/alpha.mp3"));
        letterList.add(new IcaoLetter('B', "Bravo", "ICAO/bravo.mp3"));
        letterList.add(new IcaoLetter('C', "Charlie", "ICAO/charlie.mp3"));
        letterList.add(new IcaoLetter('D', "Delta", "ICAO/delta.mp3"));
        letterList.add(new IcaoLetter('E', "Echo", "ICAO/echo.mp3"));
        letterList.add(new IcaoLetter('F', "Foxtrot", "ICAO/foxtrot.mp3"));
        letterList.add(new IcaoLetter('G', "Golf", "ICAO/golf.mp3"));
        letterList.add(new IcaoLetter('H', "Hotel", "ICAO/hotel.mp3"));
        letterList.add(new IcaoLetter('I', "India", "ICAO/india.mp3"));
        letterList.add(new IcaoLetter('J', "Juliett", "ICAO/juliett.mp3"));
        letterList.add(new IcaoLetter('K', "Kilo", "ICAO/kilo.mp3"));
        letterList.add(new IcaoLetter('L', "Lima", "ICAO/lima.mp3"));
        letterList.add(new IcaoLetter('M', "Mike", "ICAO/mike.mp3"));
        letterList.add(new IcaoLetter('N', "November", "ICAO/november.mp3"));
        letterList.add(new IcaoLetter('O', "Oscar", "ICAO/oscar.mp3"));
        letterList.add(new IcaoLetter('P', "Papa", "ICAO/papa.mp3"));
        letterList.add(new IcaoLetter('Q', "Quebec", "ICAO/quebec.mp3"));
        letterList.add(new IcaoLetter('R', "Romeo", "ICAO/romeo.mp3"));
        letterList.add(new IcaoLetter('S', "Sierra", "ICAO/sierra.mp3"));
        letterList.add(new IcaoLetter('T', "Tango", "ICAO/tango.mp3"));
        letterList.add(new IcaoLetter('U', "Uniform", "ICAO/uniform.mp3"));
        letterList.add(new IcaoLetter('V', "Victor", "ICAO/victor.mp3"));
        letterList.add(new IcaoLetter('W', "Whiskey", "ICAO/whiskey.mp3"));
        letterList.add(new IcaoLetter('X', "X-Ray", "ICAO/x-ray.mp3"));
        letterList.add(new IcaoLetter('Y', "Yankee", "ICAO/yankee.mp3"));
        letterList.add(new IcaoLetter('Z', "Zulu", "ICAO/zulu.mp3"));
        return letterList;
    }


}
