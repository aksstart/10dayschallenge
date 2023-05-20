import java.util.HashMap;
import java.util.Map;

public class recursivememoizationPascal {

    private static Map<String, Integer> memo = new HashMap<>();

    public static int getPascalValue(int row, int col) {
        String key = row + "," + col;

        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        if (col == 0 || col == row) {
            memo.put(key, 1);
            return 1;
        }
        int value = getPascalValue(row - 1, col - 1) + getPascalValue(row - 1, col);
        memo.put(key, value);
        return value;
    }

    public static void printPascalTriangle(int numRows) {
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col <= row; col++) {
                int pascalValue = getPascalValue(row, col);
                System.out.print(pascalValue + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numRows = 5;
        printPascalTriangle(numRows);
    }
}
