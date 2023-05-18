package lab9.exerciseonlist;

import java.util.*;

public class List {

    public static void insertFirst(ArrayList<Integer> list, int value) {
        list.add(0, value);
    }

    public static void insertLast(ArrayList<Integer> list, int value) {
        list.add(list.size(), value);
    }

    public static void replace(ArrayList<Integer> list, int value) {
        list.set(2, value);
    }

    public static void removeThird(ArrayList<Integer> list, int value) {
        list.remove(2);
    }

    public static void removeEvil(ArrayList<Integer> list, int value) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 666) {
                list.remove(list.get(i));
            }
        }
    }

    public static ArrayList<Integer> generateSquare() {
        ArrayList<Integer> result = new ArrayList<>();
        int number = 1;
        for (int i = 0; i < 10; i++) {
            number = i * i;
            result.add(i, number);
        }
        return result;
    }

    public static boolean contains(ArrayList<Integer> list, int value) {
        return list.contains(value);
    }

    public static void copy(ArrayList<Integer> source, ArrayList<Integer> target) {
        if (target.isEmpty()) {
            for (int i : source) {
                target.add(i);
            }
        } else {
            target.clear();
            for (int i : source) {
                target.add(i);
            }
        }
    }

    public static void reverse(ArrayList<Integer> list) {
        Collections.reverse(list);
    }

    public static void reverseManual(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size() - 1; j >= 0; j--) {
                int temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        }
    }

    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        list.addFirst(value);
        list.addLast(value);
    }
}