import java.util.Scanner;

public class Main {

    //Bài 1
    /*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = calculateSum(scanner);
        System.out.println("Tổng các giá trị chia hết cho 3 là: "+ sum);
    }
    public static int calculateSum(Scanner scanner){
        System.out.println("Nhập số hàng: ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số cột: ");
        int column = Integer.parseInt(scanner.nextLine());
        int arr [][] = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Mời bạn nhập dòng thứ" + ( i + 1 )+ ", cột thứ " + ( j + 1 ) +" là: ");
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        int sum =0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if(arr[i][j] % 3==0){
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }*/
    //Bài 2
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng của ma trận A: ");
        int rowsA = scanner.nextInt();
        System.out.println("Nhập số cột của ma trận A: ");
        int columnsA = scanner.nextInt();

        System.out.println("Nhập số dòng của ma trận B: ");
        int rowsB = scanner.nextInt();
        System.out.println("Nhập số cột của ma trận B: ");
        int columnsB = scanner.nextInt();

        if (rowsA != rowsB || columnsA != columnsB) {
            System.out.println("Số dòng hoặc số cột của hai ma trận không bằng nhau. Không thể thực hiện tính toán.");
        }else {
            calculateSum(scanner);
        }
    }
    public static void calculateSum(Scanner scanner) {
        System.out.println("Nhập số dòng và cột của ma trận: ");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] matrixA = new int[rows][columns];
        int[][] matrixB = new int[rows][columns];
        int[][] sumMatrix = addMatrices(matrixA, matrixB, rows, columns);

        System.out.println("Nhập giá trị cho ma trận A:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Nhập giá trị của phần tử hàng " + (i + 1) + ", cột " + (j + 1) + " trong ma trận A: ");
                matrixA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Nhập giá trị cho ma trận B:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Nhập giá trị của phần tử hàng " + (i + 1) + ", cột " + (j + 1) + " trong ma trận B: ");
                matrixB[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Tổng của hai ma trận là:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }

}
    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB, int rows, int columns) {
        int[][] resultMatrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        return resultMatrix;
    }
}