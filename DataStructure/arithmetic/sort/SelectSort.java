package sort;

/**
 * 选择排序</br>
 * 第1趟，在待排序记录r[1]~r[n]中选出最小的记录，将它与r[1]交换；
 * 第2趟，在待排序记录r[2]~r[n]中选出最小的记录，将它与r[2]交换；
 * 以此类推，第i趟在待排序记录r[i]~r[n]中选出最小的记录，将它与r[i]交换，使有序序列不断增长直到全部排序完毕。
 */
public class SelectSort extends Sort {

    @Override
    public int[] sort(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {

            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
        return array;
    }



}
