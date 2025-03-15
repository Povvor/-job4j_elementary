package ru.job4j.loop;

public class NumberPyramid {
    public static void draw(int n) {
        for (int i = 1; i <= n; i++) {
            for (int space = 0; space < n - i; space++) {
                System.out.print(" ");
            }
            for (int up = 1; up < i; up++) {
                System.out.print(up);
            }
            for (int down = i; down > 0; down--) {
                System.out.print(down);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Number pyramid of height 3:");
        draw(3);
        System.out.println("Number pyramid of height 5:");
        draw(5);
        System.out.println("Number pyramid of height 1:");
        draw(1);
        System.out.println("Number pyramid of height 10:");
        draw(10);

    }
}
