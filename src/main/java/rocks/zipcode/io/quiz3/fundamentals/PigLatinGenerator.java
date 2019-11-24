package rocks.zipcode.io.quiz3.fundamentals;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        int endIndex = 0;


        for (String word : words){
            if (VowelUtils.startsWithVowel(word) && word.equals(getEndIndex(words))){
                result.append(word).append("way");
            }
            else if (VowelUtils.startsWithVowel(word) && !word.equals(getEndIndex(words))){
                result.append(word).append("way").append(" ");
                }
            else{
                int startIndex = VowelUtils.getIndexOfFirstVowel(word);
                if (startIndex != -1 && word.equals(getEndIndex(words))){
                    result.append(word.substring(startIndex)).append(word, 0, startIndex).append("ay");
                }
                else if (startIndex != -1 && !word.equals(getEndIndex(words))){
                    result.append(word.substring(startIndex)).append(word, 0, startIndex).append("ay").append(" ");
                    }
                else {
                    if (word.equals(getEndIndex(words))){
                        result.append(word).append("way");
                    }
                    else if (!word.equals(getEndIndex(words))){
                        result.append(word).append("way").append(" ");
                    }
                }
            }
        }
        return result.toString();
    }

    public Integer getEndIndex(String[] words){
        int endIndex = 0;
        for (int i = 0; i < words.length; i++){
            if (i == words.length-1){
                endIndex = i;
            }
        }
        return endIndex;
    }
}
