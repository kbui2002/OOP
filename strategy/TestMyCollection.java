package strategy;

import java.util.Arrays;

public class TestMyCollection {
    public static void main(String[] args) {

        int[] data = new int[] { 4, 1, 8, 34, 11, 87, 99, 41 };
        MyCollection myCollection = new MyCollection(data);

        myCollection.setAlgorithm(new SelectionSort());
        int[] selectionSortData = myCollection.sort();
        System.out.println(Arrays.toString(selectionSortData));

        myCollection.setAlgorithm(new BubbleSort());
        int[] bubbleSortData = myCollection.sort();
        System.out.println(Arrays.toString(bubbleSortData));

        myCollection.setAlgorithm(new InsertionSort());
        int[] insertionSortData = myCollection.sort();
        System.out.println(Arrays.toString(insertionSortData));

    }
}
