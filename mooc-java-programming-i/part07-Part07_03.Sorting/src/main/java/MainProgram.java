
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {-4, -6, -9, -4, -9, 2, -5, 18, -2};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i : array) {
            if (smallest > i) {
                smallest = i;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int i = 0;
        for (int element : array) {
            if (element != smallest(array)) {
                i++;
            } else {
                break;
            }
        }
        return i;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int i = 0;
        int[] array = new int[table.length - startIndex];
        for (int j = startIndex; j < table.length; j++) {
            array[i] = table[j];
            i++;
        }

        int k = startIndex;
        while (true) {
            if (table[k] == array[indexOfSmallest(array)]) {
                break;
            }
            k++;
        }
        return k;
    }

    public static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            swap(array, i, indexOfSmallestFrom(array, i));
        }
    }
}
