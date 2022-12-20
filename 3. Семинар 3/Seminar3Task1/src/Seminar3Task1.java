import java.util.Arrays;
// Быстрая сортировка
public class Seminar3Task1 {

    public static void sort(int[] array, int min, int max) {
        if (array.length == 0) return;
        if (min >= max) return;

        int middle = min + (max - min) / 2;
        int point = array[middle];

        int i = min, j = max;
        while (i <= j) {
            while (array[i] < point) {
                i++;
            }
            while (array[j] > point) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (min < j) sort(array, min, j);

        if (max > i) sort(array, i, max);
    }

    public static void main(String[] args) {
        int[] arrayStart = {9, 8, 7, 6, 5, 4, 5, 8, 6};
        System.out.println("SourceArray:");
        System.out.println(Arrays.toString(arrayStart));

        int low = 0;
        int high = arrayStart.length - 1;

        sort(arrayStart, low, high);
        System.out.println("SortArray:");
        System.out.println(Arrays.toString(arrayStart));
    }
}