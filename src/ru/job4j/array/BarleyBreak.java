package ru.job4j.array;

public class BarleyBreak {
    public static void main(String[] args) {
        int[][] nums = new int[3][3];
        int  k = 1;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                nums[i][j] = k++;
            }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.println(nums[i][j] + " ");
        }
    }
}
