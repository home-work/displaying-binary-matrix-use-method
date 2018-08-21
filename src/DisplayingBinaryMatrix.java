import java.util.Random;
import java.util.Scanner;

public class DisplayingBinaryMatrix {
    public static void main(String[] args) {
        int sizeOfMatrix = getSizeOfMatrix();
        int[][] matrix = generateMatrix((sizeOfMatrix));
        printMatrix(matrix);
    }

    private static int[][] generateMatrix(int sizeOfMatrix) {
        Random random = new Random();
        int[][] matrix = new int[sizeOfMatrix][sizeOfMatrix];
        for (int i = 0; i < sizeOfMatrix; i++) {
            for (int j = 0; j < sizeOfMatrix; j++) {
                matrix[i][j] = random.nextInt(2) + 0;
            }
        }
        return matrix;
    }

    private static int getSizeOfMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào kích thước của ma trận vuông:");
        return scanner.nextInt();
    }


    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
