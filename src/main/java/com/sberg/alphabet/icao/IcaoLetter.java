package com.sberg.alphabet.icao;

/**
 * Beschreibt einen Buchstaben nach ICAO - Format:
 * <ul>
 * <li>Buchstabe</li>
 * <li>Name (Alpha, Charlie...)</li>
 * <li>Pfad zur MP3 Datei zum anhoeren</li>
 * </ul
 * @author  Sergej Berg
 *
 * */
public class IcaoLetter {
    private char letter;
    private String name;
    private String pathToMp3;

    public IcaoLetter(){}

    public IcaoLetter(char letter, String name, String pathToMp3) {
        this.letter = letter;
        this.name = name;
        this.pathToMp3 = pathToMp3;
    }


    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPathToMp3() {
        return pathToMp3;
    }

    public void setPathToMp3(String pathToMp3) {
        this.pathToMp3 = pathToMp3;
    }
}
