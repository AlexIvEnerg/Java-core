//package BubbleSort.BubbleSort.src ;

import java.util.Arrays;

public class BubbleSorter {
    void bubbleSorter(int[] array) {
        char r = '-';
        for (int i=0; i< array.length-1; i++) {    // номер прохода - i
            for (int j=array.length-1; j>i; j--) {    // перебор элементов в проходе
                if(array[j] < array[j-1]) {
                    int tmp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tmp;
                    r='+';
                }
                System.out.print(i + " "+ j+" ");
                System.out.println(Arrays.toString(array) + "    "+r);
                r = '-';
            }
        }
    }
}
