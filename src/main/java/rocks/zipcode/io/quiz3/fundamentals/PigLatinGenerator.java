package rocks.zipcode.io.quiz3.fundamentals;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public static final char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    public String translate(String str) {

        int start = 0;
        int firstVowel = 0;
        String finalString = "";
        for(int i = 0; i < str.length(); i++) {
            char c = Character.toLowerCase(str.charAt(i));
            if (Arrays.asList(vowels).contains(c)){
                firstVowel = i;
                break;
            }
        }
        if (start != firstVowel){
            String startString = str.substring(firstVowel, str.length());
            String endString = str.substring(start, firstVowel) + "ay";
            finalString = startString + endString;
            return finalString;
        }

        return finalString;
    }
}
