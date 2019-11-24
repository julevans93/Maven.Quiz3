package rocks.zipcode.io.quiz3.fundamentals;

import java.util.*;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        return str.substring(0, indexToCapitalize) + Character.toUpperCase(str.charAt(indexToCapitalize)) + str.substring(indexToCapitalize+1);
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
        Set<String> result = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j < string.length()+1; j++) {
                result.add(string.substring(i,j));
            }
        }
        return result.toArray(new String[result.size()]);
    }

    public static Integer getNumberOfSubStrings(String input){
        return getAllSubStrings(input).length;
    }
}
