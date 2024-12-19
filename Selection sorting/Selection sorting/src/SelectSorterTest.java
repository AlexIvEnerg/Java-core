import java.util.Arrays;

public class SelectSorterTest {
    public static void main(String[] args) {
        int[][] data = {
                {}, {1},
                {0, 3, 2, 1},
                {4, 3, 2, 1, 0},
                { 1, 2, 0, 9, 7}
        };
        for (int[] line : data) {
            System.out.print(Arrays.toString(data) + "=>");
            Select_sorter.sort(line);
            System.out.println(Arrays.toString(line));
        }
    }
}