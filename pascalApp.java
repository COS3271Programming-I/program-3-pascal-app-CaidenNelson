public class pascalApp {
    public static void main(String[] args) {

        int rows = 11;
        int[][] arr = new int[rows][];

        for (int i = 0; i < rows; i++) {

            arr[i] = new int[i + 1];
            arr[i][0] = 1;
            arr[i][i] = 1;

            for (int j = 1; j < i; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}
