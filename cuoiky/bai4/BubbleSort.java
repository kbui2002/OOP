package cuoiky.bai4;

import java.util.Arrays;

public class BubbleSort implements ISort {

    @Override
    public int[] sort(int[] data) {
        int[] copiedArray = Arrays.copyOf(data, data.length);
        int n = copiedArray.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (copiedArray[j] < copiedArray[i]) {
                    int temp = copiedArray[i];
                    copiedArray[i] = copiedArray[j];
                    copiedArray[j] = temp;
                    count++;
                }
            }
        }

        return copiedArray;
    }
}
