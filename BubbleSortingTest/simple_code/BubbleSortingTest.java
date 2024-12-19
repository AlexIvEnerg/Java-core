package BubbleSortingTest.simple_code;
//package srcCode ;

//import BubbleSortingTest.classes.BubbleSorter;

public class BubbleSortingTest {
    public static void main(String[] args) throws Exception {
        BubbleSorter bubbleSorter = new BubbleSorter();
        int[][] arr = {
            {}, {1},
            {0, 3, 2, 1},
            {6, 8, 3, 123, 5, 4},
            {1, 2, 0, 9, 7}
        };
        for (int[] line : arr) {
            bubbleSorter.sort(line);
        }
    }
}
