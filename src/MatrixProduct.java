import java.util.Scanner;

public class MatrixProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N : ");
        int N = scanner.nextInt();
        System.out.println("Enter M : ");
        int M = scanner.nextInt();
        int[][] array = new int[N][M];
        System.out.println("Enter elements : ");
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter B : ");
        int B = scanner.nextInt();
        int[][] output = findMatrixProduct(array, B);
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] findMatrixProduct(int[][] array, int B ) {
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                array[i][j] *= B;
            }
        }
        return array;
    }
}
