public class recursivePascal {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascalValue(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static int pascalValue(int i, int j) {
        if (j == 0 || i == j) {
            return 1;
        } else {
            return pascalValue(i - 1, j - 1) + pascalValue(i - 1, j);
        }
    }
}
