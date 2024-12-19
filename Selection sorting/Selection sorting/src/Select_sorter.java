
public class Select_sorter {
    public static void sort(int[] arr) {
        for (int i=0; i< arr.length;i++) {   // i - number of passage step
            int pos = i;
            int min = arr[i];
            for (int j=i+1; j< arr.length; j++) {
                if (arr[j]<min) {
                    pos = j;  // pos - индекс min элем-та
                    min = arr[j];
                }
            }
            if (min == arr[i]) continue;
            arr[pos] = arr[i];
            arr[i] = min;
        }
    }
}
