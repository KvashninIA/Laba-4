package Lr4;

import java.util.Scanner;

//Напишите программу, которая выводит в консольное окно
//прямоугольный треугольник;
public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите высоту треугольника: ");
        int height = scanner.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
