import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        System.out.println("введите 3 числа через пробел");
        printArray(input());

    }

    public static int[][] input () {
        int[][] array= new int[3][3];
        for (int i = 1; i <4; i++) {
            System.out.println("введите столбик номер " + i);
            Scanner in = new Scanner(System.in);
            String line = in.nextLine();
            String[] spline = line.split(" ");
            int[] numbers = new int[spline.length];
            for (int j = 0; j < spline.length; j++) {
                numbers[j] = Integer.parseInt(spline[j]);
            }
            array[i-1]= numbers;

        }
        System.out.println("До");
        printArray(array);
        System.out.println("После");
        array=flip(array);
        return array;


    }
    public static int[][] flip(int[][] arr) {
        int x = arr.length;
        int y = arr[0].length;

        int[][] flipped = new int[y][x];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                flipped[j][i] = arr[i][j];
            }
        }

        return flipped;
    }
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}