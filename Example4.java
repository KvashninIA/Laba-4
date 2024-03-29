package Lr4;

import java.util.Scanner;
//Напишите программу, в которой создается двумерный массив, который
//выводит прямоугольный треугольник;
public class Example4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите высоту треугольника: ");
        int height = scanner.nextInt();
        int[][] triangle = new int[height][];

        for (int i = 0; i < height; i++) {
            triangle[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = 2; //любое другое
            }
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
