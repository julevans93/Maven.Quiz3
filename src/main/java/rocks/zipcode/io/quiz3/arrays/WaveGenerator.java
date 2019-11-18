package rocks.zipcode.io.quiz3.arrays;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        String[] newArray = new String[0];
        for (int i = 1; i < str.length(); i++){
            Character.toLowerCase(str.charAt(i));
            for (int j = i; j < str.length(); j++){
            if (Character.isUpperCase(str.charAt(j))){
                Character.toUpperCase(str.charAt(j+1));
            }
            }
        }
        return null;
    }
}
