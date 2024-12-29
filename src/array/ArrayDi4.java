package array;

public class ArrayDi4 {
    public static void main(String[] args) {
//        int[][] arr = new int[2][3];
        int[][] arr = new int[4][5];
        
        int i = 1;
        for (int r = 0; r < arr.length; r++) for (int c = 0; c < arr[r].length; c++) arr[r][c] = i++;

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();

        }
    }
}
