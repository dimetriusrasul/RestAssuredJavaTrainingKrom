package org.example;
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Hello friends!");
        Main main = new Main();
        main.run();
    }

    public void userShapeOption() {
        System.out.println("Welcome to a Shape Drawer!\n" +
                "Shape Option:\n" +
                "1. Triangle\n" +
                "2. Square\n" +
                "3. Rectangle\n" +
                "4. Exit\n");
    }

    public void shapeGenerator(int option) {
        switch (option) {
            case 1:
                System.out.println("Triangle size: ");
                int height2 = scanner.nextInt();
                drawTriangle(height2);
                break;
            case 2:
                System.out.println("Square size: ");
                int sides = scanner.nextInt();
                drawSquare(sides);
                break;
            case 3:
                System.out.println("Rectangle length: ");
                int width = scanner.nextInt();

                System.out.println("Rectangle width: ");
                int height3 = scanner.nextInt();
                drawRectangle(width, height3);
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Please input only 1-4");
                break;
        }
    }


    public void drawTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = size - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void drawSquare(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void drawRectangle(int width, int length) {
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= length; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void run() {
        for(;;) {
            userShapeOption();
            System.out.println("Enter your shape: ");
            int choice = scanner.nextInt();
            shapeGenerator(choice);
            System.out.println();
        }
    }

}