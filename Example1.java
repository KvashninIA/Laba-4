package Lr4;

//Напишите программу, которая выводить в консольное окно
//прямоугольник, размеры сторон которого, ширина: 23 колонки, высота: 11
//строк;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ширину прямоугольника: ");
        int width = scanner.nextInt();
        System.out.print("Введите высоту прямоугольника: ");
        int height = scanner.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*"); //дезигн такой дезигн
            }
            System.out.println();
        }
    }
}
