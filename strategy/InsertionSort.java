package strategy;

import java.util.Arrays;

public class InsertionSort implements ISort {

    @Override
    public int[] sort(int[] data) {
        int[] copiedArray = Arrays.copyOf(data, data.length);
        int n = copiedArray.length;
        for (int j = 1; j < n; j++) {
            int key = copiedArray[j];
            int i = j - 1;
            while ((i > -1) && (copiedArray[i] > key)) {
                copiedArray[i + 1] = copiedArray[i];
                i--;
            }
            copiedArray[i + 1] = key;
        }
        return copiedArray;
    }
}
