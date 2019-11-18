package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++){
            if (i == indexToCapitalize){
                Character.toUpperCase(array[i]);
            }
        }
        return array.toString();
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        for (int i = 0; i < baseString.length(); i ++){
            if (baseString.charAt(i) == characterToCheckFor && i == indexOfString){
                return true;
            }
        }
        return false;
    }

    public static String[] getAllSubStrings(String string) {
        String[] array;
        Integer counter = 0;
        for (int i = 0; i < string.length(); i++){
            for (int j = i+1; j <= string.length(); j++){
                string.substring(i,j);
                counter++;

            }
        }
        for (int i = 0; i < string.length(); i++){
            array = new String[counter];

        }
        return null;
    }

    public static Integer getNumberOfSubStrings(String input){
        return null;
    }
}
