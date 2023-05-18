package lab9.exerciseonset;
import java.util.*;

public class Sets {
    public static Set<Integer> intersectionManual(Set<Integer> first , Set<Integer> second) {
        Set<Integer> newArr = new HashSet<Integer>();
        for(int i : first) {
            for (int j : second) {
                if(i==j) {
                    newArr.add(i);
                }
            }
        }
        return newArr;
    }

    public static Set<Integer> unionManual(Set<Integer> first , Set<Integer> second) {
        for (int i = 0; i < arr.length; i++){
            add(arr[i]);
        }
    }

    public static Set<Integer> intersection(Set<Integer> first , Set<Integer> second) {
        first.retainAll(second);
        return first;
    }

    public static Set<Integer> union(Set<Integer> first , Set<Integer> second) {
        first.addAll(second);
        return second;
    }

}
