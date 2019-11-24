package rocks.zipcode.io.quiz3.generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<T> {
    private final T[] array;

    public ArrayUtility(T[] array) {
        this.array = array;
    }

    public T findOddOccurringValue() {
        T result = null;
        for (int i = 0; i < array.length; i++){
            if (getNumberOfOccurrences(array[i]) % 2 != 0) {
                result = array[i];
                break;
            }
        }
        return result;
    }

    public T findEvenOccurringValue() {
        T result = null;
        for (int i = 0; i < array.length; i++){
            if (getNumberOfOccurrences(array[i]) % 2 == 0) {
                result = array[i];
                break;
            }
        }
        return result;
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        Integer counter = 0;
        for (T x : array){
            if (x == valueToEvaluate){
                counter++;
            }
        }
        return counter;
    }

    public T[] filter(Function<T, Boolean> predicate) {
        List<T> list = (ArrayList<T>)
                Arrays.stream(array).filter(value -> predicate.apply(value))
                .collect(Collectors.toList());
        return list.toArray(Arrays.copyOf(array, list.size()));
    }
}
