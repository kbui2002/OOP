package lab9.exerciseonlist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        List.insertFirst(list, 15);
        System.out.println(list);
        System.out.println(List.generateSquare());
    }
}
