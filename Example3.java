package Lr4;

import java.util.Scanner;

//Напишите программу, в которой создается двумерный массив, который
//выводи прямоугольник из цифр 2;
public class Example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ширину прямоугольника: ");
        int width = scanner.nextInt();
        System.out.print("Введите высоту прямоугольника: ");
        int height = scanner.nextInt();

        int[][] rectangle = new int[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                rectangle[i][j] = 2; //любое другое
            }
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(rectangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}