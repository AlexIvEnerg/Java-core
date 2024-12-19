import java.util.Scanner;

public class BubbleSortingTest {
    public static void main(String[] args) {
        int[][] arr = {
                {}, {1},
                {0, 3, 2, 1},
                {6, 8, 3, 123, 5, 4},
                {1, 2, 0, 9, 7}
        };
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Введите выбор остановки сортировки: ");  // 8 - stop of cyclicity, allow a
            int v = scan.nextInt();    //  last cycle
            int k=0;
            for (int[] line : arr) {
                BubbleSorterMod.sort(line);
                k++;
                if (v==8 & k==3) break;
            }
        }

    }
}