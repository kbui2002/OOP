package cuoiky.bai4;

import java.util.Arrays;

public class InsertionSort implements ISort {

    @Override
    public int[] sort(int[] data) {
        int[] copiedArray = Arrays.copyOf(data, data.length);
        int n = copiedArray.length;
        int count = 0;
        for (int j = 1; j < n; j++) {
            int key = copiedArray[j];
            int i = j - 1;
            while ((i > -1) && (copiedArray[i] > key)) {
                copiedArray[i + 1] = copiedArray[i];
                i--;
            }
            copiedArray[i + 1] = key;
            count++;
        }
        return copiedArray;
    }
}
