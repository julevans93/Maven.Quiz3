package rocks.zipcode.io.quiz3.generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {

        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        int counter = 0;
        SomeType finalNum = null;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if (array[i] == array[j]){
                    counter++;
                }
                if (counter % 2 != 0){
                    finalNum = array[i];
                }
            }
        }

        return finalNum;
    }

    public SomeType findEvenOccurringValue() {
        int counter = 0;
        SomeType finalNum = null;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if (array[i] == array[j]){
                    counter++;
                }
                if (counter % 2 == 0){
                    finalNum = array[i];
                }
            }
        }
        return finalNum;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        Integer counter = 0;
        for (SomeType x : array){
            if (x == valueToEvaluate){
                counter++;
            }
        }
        return counter;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {

        return null;
    }
}
