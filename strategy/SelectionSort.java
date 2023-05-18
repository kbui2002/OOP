package strategy;

import java.util.Arrays;

public class SelectionSort implements ISort {

    @Override
    public int[] sort(int[] data) {
        int[] copiedArray = Arrays.copyOf(data, data.length);
        for (int i = 0; i < copiedArray.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < copiedArray.length; j++) {
                if (copiedArray[j] < copiedArray[index]) {
                    index = j;
                }
            }
            int smallerNumber = copiedArray[index];
            copiedArray[index] = copiedArray[i];
            copiedArray[i] = smallerNumber;
        }

        return copiedArray;
    }
}
