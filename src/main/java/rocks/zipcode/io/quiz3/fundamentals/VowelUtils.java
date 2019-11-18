package rocks.zipcode.io.quiz3.fundamentals;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    //public static char[] vowels = {'a', 'e', 'i', 'o','u'};
    public static String vowels = "aeiou";

    public static Boolean hasVowels(String word) {
        for (int i = 0; i < word.length(); i++){
            for (int j = 0; j < vowels.length(); j++){
                if (word.charAt(i) == vowels.charAt(j)){
                    return true;
                }
            }
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        String loweredWord = word.toLowerCase();
        for (int i = 0; i < loweredWord.length(); i++){
            for (int j = 0; j < vowels.length(); j++){
                if (loweredWord.charAt(i) == vowels.charAt(j)){
                    return i;
                }
            }
        }
        return -1;
    }


    public static Boolean startsWithVowel(String word) {
        for (int i = 0; i < vowels.length(); i++){
            if (word.charAt(0) == vowels.charAt(i)){
                return true;
            }
        }
        return false;
    }

    public static Boolean isVowel(Character character) {
        for (int i = 0; i < vowels.length(); i++){
            if (vowels.charAt(i) == Character.toLowerCase(character)){
                return true;
            }
        }
        return false;
    }
}
