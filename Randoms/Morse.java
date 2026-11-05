package Randoms;

import java.util.HashMap;
import java.util.Map;

public class Morse{
    private static final Map <Character, String> textoMorse = new HashMap<>();
    private static final Map <String,Character> morseTexto = new HashMap<>();
    
    static {
        String [][] tabela = {
            {"A", ".-"}, {"B", "-..."}, {"C","-.-."}, {"D","-.."},
            {"E","."}, {"F", "..-."}, {"G", "--."}, {"H", "...."},
            {"I", ".."}, {"J", ".---"}, {"K", "-.-"}, {"L", ".-.."},
            {"M", "--"}, {"N", "-."}, {"O", "---"}, {"P", ".--."},
            {"Q", "--.-"}, {"R", ".-."}, {"S", "..."}, {"T", "-"},
            {"U", "..-"}, {"V", "...-"}, {"W", ".--"}, {"X", "-..-"},
            {"Y", "-.--"}, {"Z", "--.."},

            {"0", "-----"}, {"1", ".----"}, {"2", "..---"}, {"3", "...--"},
            {"4", "....-"}, {"5", "....."}, {"6", "-...."}, {"7", "--..."},
            {"8", "---.."}, {"9", "----."}
        };
        for (String[] par : tabela){
            char letra = par[0].charAt(0);
            textoMorse.put(letra, par[1]);
            morseTexto.put(par[1], letra);
        }
    }
    
    
    
    
    
    
    
    public static void main(String[] args) {
        System.out.println(textoMorse.get('S'));
        System.out.println(morseTexto.get("---"));








    }
}